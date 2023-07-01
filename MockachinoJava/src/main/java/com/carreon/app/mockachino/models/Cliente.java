package com.carreon.app.mockachino.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "clienteMocka")
public class Cliente {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOC_SEQ1")
	@SequenceGenerator(sequenceName = "moc_seq1", allocationSize = 1, name ="MOC_SEQ1")
	private Long id;
	
	@NotBlank
	@Column(name= "ape_paterno")
	private String apPaterno;
	
	
	@Column(name= "ape_materno")
	private String apMaterno;
	
	@NotBlank
	@Column(name= "nombre")
	private String nombre;
	
	@NotBlank
	@Column(name= "sexo")
	private String sexo;
	
	@NotBlank
	@Column(name= "pais")
	private String pais;
	
	@NotBlank
	@Column(name= "estado")
	private String estado;
	
	
	@Column(name= "fecha_nac")
	private Date fechNac;
	
	@NotBlank
	@Column(name= "municipio")
	private String municipio;
	
	
	@Column(name= "peso")
	private Double peso;
	
	
	@Column(name= "estatura")
	private Double estatura;
	
	
	@Column(name= "grupo_sanguineo")
	private String gSanguineo;
	
	@Column(name= "nacionalidad")
	private String nacionalidad;
	
	@Column(name= "num_licencia")
	private String numLicencia;
	
	@Column(name= "num_pasaporte")
	private String numPasaporte;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "estado_civil")
	private String estadoCivil;
	
	@ManyToOne
	@JoinColumn(name="supervisor_id")
	private Supervisor supervisor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechNac() {
		return fechNac;
	}

	public void setFechNac(Date fechNac) {
		this.fechNac = fechNac;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public String getgSanguineo() {
		return gSanguineo;
	}

	public void setgSanguineo(String gSanguineo) {
		this.gSanguineo = gSanguineo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(String numLicencia) {
		this.numLicencia = numLicencia;
	}

	public String getNumPasaporte() {
		return numPasaporte;
	}

	public void setNumPasaporte(String numPasaporte) {
		this.numPasaporte = numPasaporte;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
	

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", apPaterno=");
		builder.append(apPaterno);
		builder.append(", apMaterno=");
		builder.append(apMaterno);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", fechNac=");
		builder.append(fechNac);
		builder.append(", municipio=");
		builder.append(municipio);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", estatura=");
		builder.append(estatura);
		builder.append(", gSanguineo=");
		builder.append(gSanguineo);
		builder.append(", nacionalidad=");
		builder.append(nacionalidad);
		builder.append(", numLicencia=");
		builder.append(numLicencia);
		builder.append(", numPasaporte=");
		builder.append(numPasaporte);
		builder.append(", email=");
		builder.append(email);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", supervisor=");
		builder.append(supervisor);
		builder.append("]");
		return builder.toString();
	}

	
	

}
