package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tiposms generated by hbm2java
 */
public class Tiposms implements java.io.Serializable {

	private Integer idtiposms;
	private String descripcion;
	private Set smsbroadcasts = new HashSet(0);
	private Set smsenvios = new HashSet(0);

	public Tiposms() {
	}

	public Tiposms(String descripcion, Set smsbroadcasts, Set smsenvios) {
		this.descripcion = descripcion;
		this.smsbroadcasts = smsbroadcasts;
		this.smsenvios = smsenvios;
	}

	public Integer getIdtiposms() {
		return this.idtiposms;
	}

	public void setIdtiposms(Integer idtiposms) {
		this.idtiposms = idtiposms;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getSmsbroadcasts() {
		return this.smsbroadcasts;
	}

	public void setSmsbroadcasts(Set smsbroadcasts) {
		this.smsbroadcasts = smsbroadcasts;
	}

	public Set getSmsenvios() {
		return this.smsenvios;
	}

	public void setSmsenvios(Set smsenvios) {
		this.smsenvios = smsenvios;
	}

}
