import { Component, ViewChild, ElementRef, OnInit } from '@angular/core';
import { MiservicioService } from '../Servicio/miservicio.service';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';



@Component({
  selector: 'app-alta-cliente',
  templateUrl: './alta-cliente.component.html',
  styleUrls: ['./alta-cliente.component.css']
})
export class AltaClienteComponent implements OnInit{
  public selected = true;
  public estados : any;
  public municipios:any;
  form;
 
 

  constructor(private servicio: MiservicioService, private formBuilder: FormBuilder) {
    
    this.servicio.obtenerPais();
    this.servicio.obtenerNacionalidad();
    this.servicio.obtenerSupervisor();

    this.form = formBuilder.group({
      apPaterno:['',Validators.required],
      apMaterno:['',Validators.required],
      nombre:['',Validators.required],
      sexo:['',Validators.required],
      pais:['',Validators.required],
      estado:['',Validators.required],
      fechNac:['',Validators.required],
      municipio:['',Validators.required],
      peso:['',Validators.required],
      estatura:['',Validators.required],
      gSanguineo:['',Validators.required],
      nacionalidad:['',Validators.required],
      numLicencia:['',Validators.required],
      numPasaporte:['',Validators.required],
      email:['',Validators.required],
      estCivil:['', Validators.required],
      supervisor:['',Validators.required]
    });
    
  }
  ngOnInit(): void {
    
  }

  submit(){
    if(this.form.valid){
      console.log(this.form.value)
      const apPat = this.referenciaApPaterno.nativeElement.value;
    const aptMat  = this.referenciaApMaterno.nativeElement.value;
    const nombre = this.referenciaNombre.nativeElement.value;
    const sexo = this.referenciaSexo.nativeElement.value;
    const pais =  this.referenciaPais.nativeElement.value;
    const fechaNac  = this.referenciaFechaNac.nativeElement.value;
    const estado =  this.referenciaEstado.nativeElement.value;
    const  municipio = this.referenciaMunicipio.nativeElement.value;
    const peso= this.referenciaPeso.nativeElement.value;
    const estatura = this.referenciaEstatura.nativeElement.value;
    const grupoSang= this.referenciaGSanguineo.nativeElement.value;
    const nacionalidad= this.referenciaNacionalidad.nativeElement.value;
    const numLicencia= this.referenciaNumLicencia.nativeElement.value;
    const numPasaporte  = this.referenciaNumPasaporte.nativeElement.value;
    const email =  this.referenciaEmail.nativeElement.value;
    const supervisor  = this. referenciaSupervisor.nativeElement.value;
    const estCivile =  this.referenciaEstCivil.nativeElement.value;

    this.servicio.guardarCliente(apPat,aptMat,nombre,sexo,pais,fechaNac,estado,municipio,peso, estatura, grupoSang, nacionalidad, 
       numLicencia, numPasaporte,email, supervisor,estCivile);

    }
    else{
      alert("llena todos los campos")
    }
  }


  @ViewChild("apPaterno") referenciaApPaterno!: ElementRef;
  @ViewChild("apMaterno") referenciaApMaterno!: ElementRef;
  @ViewChild("nombre") referenciaNombre!: ElementRef;
  @ViewChild("sexo") referenciaSexo!: ElementRef;
  @ViewChild("pais") referenciaPais!: ElementRef;
  @ViewChild("estado") referenciaEstado!: ElementRef;
  @ViewChild("fechNac") referenciaFechaNac!: ElementRef;
  @ViewChild("municipio") referenciaMunicipio!: ElementRef;
  @ViewChild("peso") referenciaPeso!: ElementRef;
  @ViewChild("estatura") referenciaEstatura!: ElementRef;
  @ViewChild("gSanguineo") referenciaGSanguineo!: ElementRef;
  @ViewChild("nacionalidad") referenciaNacionalidad!: ElementRef;
  @ViewChild("numLicencia") referenciaNumLicencia!: ElementRef;
  @ViewChild("numPasaporte") referenciaNumPasaporte!: ElementRef;
  @ViewChild("email") referenciaEmail!: ElementRef;
  @ViewChild("supervisor") referenciaSupervisor!: ElementRef;
  @ViewChild("estCivil") referenciaEstCivil!: ElementRef;



  get listarPaises() {
    return this.servicio.listaPaises;
  }

  get listarEstados(){
    return this.servicio.listaEstados;
  }

  get listarMunicipios(){
    return this.servicio.listaMunicipios;
  }

  get listaNacionalidad(){

     return this.servicio.listaNacionalidades;
  }

  get listarSupervisores(){
    return this.servicio.listaSupervisores;
  }

  changeCountry(){
    console.log("country:" + this.referenciaPais)
    this.estados = this.servicio.obtenerEstado(this.referenciaPais.nativeElement.value);
    return this.estados;
  }

  changeState(){
    console.log("municipaly:"+this.referenciaEstado.nativeElement.value)
    this.municipios = this.servicio.obtenerMunicipios(this.referenciaEstado.nativeElement.value);
    return this.municipios;
  }
 

}
