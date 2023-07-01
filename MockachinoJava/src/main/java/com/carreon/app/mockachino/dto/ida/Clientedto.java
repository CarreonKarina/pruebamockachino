package com.carreon.app.mockachino.dto.ida;

import java.util.Date;





public class Clientedto {
	
	private Long id;
	
	
	private String apPaterno;
	
	
	
	private String apMaterno;
	
	
	private String nombre;
	
	private String sexo;
	
	
	private String pais;
	
	
	private String estado;
	
	
	private String fechNac;
	
	
	private String municipio;
	
	
	private Double peso;
	
	
	
	private Double estatura;
	
	
	
	private String gSanguineo;
	
	
	private String nacionalidad;
	
	
	private String numLicencia;
	

	private String numPasaporte;
	
	
	private String email;
	
	private String estadoCivil;
	
	private Long supervisorId;
	

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

	

	public String getFechNac() {
		return fechNac;
	}

	public void setFechNac(String fechNac) {
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

	public Long getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
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
		builder.append("Clientedto [id=");
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
		builder.append(", supervisorId=");
		builder.append(supervisorId);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
