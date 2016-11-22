package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Transaccion generated by hbm2java
 */
public class Transaccion implements java.io.Serializable {

	private Integer idtransaccion;
	private Sucursal sucursal;
	private Tipotransaccion tipotransaccion;
	private Date fechatransaccion;
	private String nrofactura;
	private int valortotaltx;
	private Set puntoses = new HashSet(0);
	private Set emailenvios = new HashSet(0);
	private Set detransaccions = new HashSet(0);

	public Transaccion() {
	}

	public Transaccion(Sucursal sucursal, Tipotransaccion tipotransaccion,
			Date fechatransaccion, String nrofactura, int valortotaltx) {
		this.sucursal = sucursal;
		this.tipotransaccion = tipotransaccion;
		this.fechatransaccion = fechatransaccion;
		this.nrofactura = nrofactura;
		this.valortotaltx = valortotaltx;
	}

	public Transaccion(Sucursal sucursal, Tipotransaccion tipotransaccion,
			Date fechatransaccion, String nrofactura, int valortotaltx,
			Set puntoses, Set emailenvios, Set detransaccions) {
		this.sucursal = sucursal;
		this.tipotransaccion = tipotransaccion;
		this.fechatransaccion = fechatransaccion;
		this.nrofactura = nrofactura;
		this.valortotaltx = valortotaltx;
		this.puntoses = puntoses;
		this.emailenvios = emailenvios;
		this.detransaccions = detransaccions;
	}

	public Integer getIdtransaccion() {
		return this.idtransaccion;
	}

	public void setIdtransaccion(Integer idtransaccion) {
		this.idtransaccion = idtransaccion;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Tipotransaccion getTipotransaccion() {
		return this.tipotransaccion;
	}

	public void setTipotransaccion(Tipotransaccion tipotransaccion) {
		this.tipotransaccion = tipotransaccion;
	}

	public Date getFechatransaccion() {
		return this.fechatransaccion;
	}

	public void setFechatransaccion(Date fechatransaccion) {
		this.fechatransaccion = fechatransaccion;
	}

	public String getNrofactura() {
		return this.nrofactura;
	}

	public void setNrofactura(String nrofactura) {
		this.nrofactura = nrofactura;
	}

	public int getValortotaltx() {
		return this.valortotaltx;
	}

	public void setValortotaltx(int valortotaltx) {
		this.valortotaltx = valortotaltx;
	}

	public Set getPuntoses() {
		return this.puntoses;
	}

	public void setPuntoses(Set puntoses) {
		this.puntoses = puntoses;
	}

	public Set getEmailenvios() {
		return this.emailenvios;
	}

	public void setEmailenvios(Set emailenvios) {
		this.emailenvios = emailenvios;
	}

	public Set getDetransaccions() {
		return this.detransaccions;
	}

	public void setDetransaccions(Set detransaccions) {
		this.detransaccions = detransaccions;
	}

}
