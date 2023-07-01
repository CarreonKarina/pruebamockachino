import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class MiservicioService {
  public listaPaises: any[];
  public listaEstados: any[];
  public listaMunicipios: any[];
  public listaSupervisores: any[];
  private keyaut = "u5ixLKK9tJL1ODvY58ZvozX9KPUS_T96n0YPMJVs5_qh8JDRSgO172oiV0KEFLB9Txg";
  private correo = "karina.carreon.tula@gmail.com";
  private auttoken: any;

  public listaNacionalidades : any[];
  //private pais : string;
  //private cabPais : any;

  constructor(private httpCliente: HttpClient) {
    this.listaPaises = [];
    this.listaEstados = [];
    this.listaMunicipios = [];
    this.listaNacionalidades=[];
    this.listaSupervisores=[];
  }


  obtenerPais(): void {
    const headers = new HttpHeaders().set("user-email", this.correo).set("api-token", this.keyaut);

    this.httpCliente.get("https://www.universal-tutorial.com/api/getaccesstoken", { headers })
      .subscribe((respues: any) => {
        this.auttoken = respues;
        console.log(this.auttoken);
        this.getPais();


      });

  }

  getPais(): void {
    const tokenauto = 'Bearer ' + this.auttoken['auth_token'];
    console.log(tokenauto);
    const headers = new HttpHeaders().set("Authorization", "Bearer " + this.auttoken['auth_token']).set("Accept", "application/json");
    this.httpCliente.get("https://www.universal-tutorial.com/api/countries/", { headers })
      .subscribe((respuesta: any) => {

        this.listaPaises = respuesta;
        console.log(this.listaPaises);

      });
  }

  obtenerEstado(pais: string): void {
    const headers = new HttpHeaders().set("Authorization", "Bearer " + this.auttoken['auth_token']).set("Accept", "application/json");
    this.httpCliente.get("https://www.universal-tutorial.com/api/states/"+pais, { headers })
      .subscribe((respuesta: any) => {

        this.listaEstados = respuesta;
        console.log(this.listaEstados);

      });
  }


  obtenerMunicipios(estado: string): void {
    console.log("estado:"+estado)
    const headers = new HttpHeaders().set("Authorization", "Bearer " + this.auttoken['auth_token']).set("Accept", "application/json");
    this.httpCliente.get("https://www.universal-tutorial.com/api/cities/"+estado, { headers })
      .subscribe((respuesta: any) => {

        this.listaMunicipios = respuesta;
        console.log(this.listaMunicipios);

      });
  }

  obtenerNacionalidad(): void{
    this.httpCliente.get("http://www.webapimetasalud.com/api/General/Nacionalidades").subscribe((respuesta: any)=>{
      this.listaNacionalidades = respuesta;
      console.log(this.listaMunicipios)
    });
  }

  obtenerSupervisor(): void{
    this.httpCliente.get("http://localhost:8080/micro/supervisor").subscribe((respuesta: any)=>{
      this.listaSupervisores = respuesta;
      console.log(this.listaSupervisores)
    });
  }
  guardarCliente(apPat: string, aptMat : string, nombre : string, sexo: string, pais: string, fechaNac: any, estado: string, municipio : string, peso : number, estatura : number,
    gSanguineo : string, nacionalidad : string, licencia : string, pasaporte: string, email: string, superv: string, estadoCivil : number){
    this.httpCliente.post("http://localhost:8080/micro/cliente",{
    "apPaterno": apPat,
    "apMaterno": aptMat,
    "nombre": nombre,
    "sexo":sexo,
    "pais": pais,
    "estado":estado,
    "municipio":municipio,
    "fechNac": fechaNac,
    "peso": peso,
    "estatura": estatura,
    "gSanguineo":gSanguineo,
    "nacionalidad":nacionalidad,
    "numLicencia": licencia ,
    "numPasaporte": pasaporte,
    "email": email,
    "estadoCivil":estadoCivil,
    "supervisorId":superv
    }).subscribe((respuesta : any)=>{
      console.log("Se registor")
      console.log(respuesta.msg);
    });
  }
  
}


