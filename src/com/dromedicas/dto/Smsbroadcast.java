package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

/**
 * Smsbroadcast generated by hbm2java
 */
public class Smsbroadcast implements java.io.Serializable {

	private SmsbroadcastId id;
	private Afiliado afiliado;
	private Estadosms estadosms;
	private Tiposms tiposms;

	public Smsbroadcast() {
	}

	public Smsbroadcast(SmsbroadcastId id, Afiliado afiliado,
			Estadosms estadosms, Tiposms tiposms) {
		this.id = id;
		this.afiliado = afiliado;
		this.estadosms = estadosms;
		this.tiposms = tiposms;
	}

	public SmsbroadcastId getId() {
		return this.id;
	}

	public void setId(SmsbroadcastId id) {
		this.id = id;
	}

	public Afiliado getAfiliado() {
		return this.afiliado;
	}

	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}

	public Estadosms getEstadosms() {
		return this.estadosms;
	}

	public void setEstadosms(Estadosms estadosms) {
		this.estadosms = estadosms;
	}

	public Tiposms getTiposms() {
		return this.tiposms;
	}

	public void setTiposms(Tiposms tiposms) {
		this.tiposms = tiposms;
	}

}