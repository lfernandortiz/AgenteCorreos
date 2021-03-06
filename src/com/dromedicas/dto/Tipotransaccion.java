package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tipotransaccion generated by hbm2java
 */
public class Tipotransaccion implements java.io.Serializable {

	private Integer idtipotransaccion;
	private String descripcion;
	private Set transaccions = new HashSet(0);

	public Tipotransaccion() {
	}

	public Tipotransaccion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipotransaccion(String descripcion, Set transaccions) {
		this.descripcion = descripcion;
		this.transaccions = transaccions;
	}

	public Integer getIdtipotransaccion() {
		return this.idtipotransaccion;
	}

	public void setIdtipotransaccion(Integer idtipotransaccion) {
		this.idtipotransaccion = idtipotransaccion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set transaccions) {
		this.transaccions = transaccions;
	}

}
