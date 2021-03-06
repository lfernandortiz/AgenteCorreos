package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuarioweb generated by hbm2java
 */
public class Usuarioweb implements java.io.Serializable {

	private int idusuarioweb;
	private Usuario usuario;
	private String usuario_1;
	private String clave;
	private String nombreusuario;
	private boolean activo;
	private Date ultacceso;
	private Date ultcamioclave;
	private Integer creado;
	private Date fechacreado;
	private int tipousuarioid;
	private Set usuarioperfils = new HashSet(0);
	private Set permisorols = new HashSet(0);

	public Usuarioweb() {
	}

	public Usuarioweb(Usuario usuario, String usuario_1, String clave,
			String nombreusuario, boolean activo, int tipousuarioid) {
		this.usuario = usuario;
		this.usuario_1 = usuario_1;
		this.clave = clave;
		this.nombreusuario = nombreusuario;
		this.activo = activo;
		this.tipousuarioid = tipousuarioid;
	}

	public Usuarioweb(Usuario usuario, String usuario_1, String clave,
			String nombreusuario, boolean activo, Date ultacceso,
			Date ultcamioclave, Integer creado, Date fechacreado,
			int tipousuarioid, Set usuarioperfils, Set permisorols) {
		this.usuario = usuario;
		this.usuario_1 = usuario_1;
		this.clave = clave;
		this.nombreusuario = nombreusuario;
		this.activo = activo;
		this.ultacceso = ultacceso;
		this.ultcamioclave = ultcamioclave;
		this.creado = creado;
		this.fechacreado = fechacreado;
		this.tipousuarioid = tipousuarioid;
		this.usuarioperfils = usuarioperfils;
		this.permisorols = permisorols;
	}

	public int getIdusuarioweb() {
		return this.idusuarioweb;
	}

	public void setIdusuarioweb(int idusuarioweb) {
		this.idusuarioweb = idusuarioweb;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getUsuario_1() {
		return this.usuario_1;
	}

	public void setUsuario_1(String usuario_1) {
		this.usuario_1 = usuario_1;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombreusuario() {
		return this.nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getUltacceso() {
		return this.ultacceso;
	}

	public void setUltacceso(Date ultacceso) {
		this.ultacceso = ultacceso;
	}

	public Date getUltcamioclave() {
		return this.ultcamioclave;
	}

	public void setUltcamioclave(Date ultcamioclave) {
		this.ultcamioclave = ultcamioclave;
	}

	public Integer getCreado() {
		return this.creado;
	}

	public void setCreado(Integer creado) {
		this.creado = creado;
	}

	public Date getFechacreado() {
		return this.fechacreado;
	}

	public void setFechacreado(Date fechacreado) {
		this.fechacreado = fechacreado;
	}

	public int getTipousuarioid() {
		return this.tipousuarioid;
	}

	public void setTipousuarioid(int tipousuarioid) {
		this.tipousuarioid = tipousuarioid;
	}

	public Set getUsuarioperfils() {
		return this.usuarioperfils;
	}

	public void setUsuarioperfils(Set usuarioperfils) {
		this.usuarioperfils = usuarioperfils;
	}

	public Set getPermisorols() {
		return this.permisorols;
	}

	public void setPermisorols(Set permisorols) {
		this.permisorols = permisorols;
	}

}
