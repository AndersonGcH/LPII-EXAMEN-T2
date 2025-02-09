package com.cibertec.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idclie")
	private int idClie;
	
	@Column(name="razon_soc")
	private String razonSoc;
	
	@Column(name="nombre_ciudad")
	private String nombreCiudad;
	
	@Column(name="direccion_clie")
	private String direccionClie;
	
	@Column(name="telefono")
	private String telefono;

	public Cliente() {
	}
	
	
}
