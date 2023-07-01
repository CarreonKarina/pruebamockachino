package com.carreon.app.mockachino.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="supervisor")
public class Supervisor {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOCS_SEQ1")
	@SequenceGenerator(sequenceName = "mocs_seq1", allocationSize = 1, name ="MOCS_SEQ1")
	private Long id;
	
	@Column(name= "ape_paterno")
	private String apPaterno;
	
	@Column(name= "ape_materno")
	private String apMaterno;
	
	@Column(name= "nombre")
	private String nombre;
	
	@Column(name= "departamento")
	private String departamento;

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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Supervisor [id=");
		builder.append(id);
		builder.append(", apPaterno=");
		builder.append(apPaterno);
		builder.append(", apMaterno=");
		builder.append(apMaterno);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append("]");
		return builder.toString();
	}
	
	

}
