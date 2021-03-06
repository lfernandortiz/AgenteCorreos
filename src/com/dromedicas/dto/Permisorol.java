package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

/**
 * Permisorol generated by hbm2java
 */
public class Permisorol implements java.io.Serializable {

	private PermisorolId id;
	private Usuarioweb usuarioweb;
	private Rol rol;
	private Boolean agregar;
	private Boolean seleccionar;
	private Boolean insertar;
	private Boolean eliminar;
	private Boolean especial1;
	private Boolean especial2;

	public Permisorol() {
	}

	public Permisorol(PermisorolId id, Usuarioweb usuarioweb, Rol rol) {
		this.id = id;
		this.usuarioweb = usuarioweb;
		this.rol = rol;
	}

	public Permisorol(PermisorolId id, Usuarioweb usuarioweb, Rol rol,
			Boolean agregar, Boolean seleccionar, Boolean insertar,
			Boolean eliminar, Boolean especial1, Boolean especial2) {
		this.id = id;
		this.usuarioweb = usuarioweb;
		this.rol = rol;
		this.agregar = agregar;
		this.seleccionar = seleccionar;
		this.insertar = insertar;
		this.eliminar = eliminar;
		this.especial1 = especial1;
		this.especial2 = especial2;
	}

	public PermisorolId getId() {
		return this.id;
	}

	public void setId(PermisorolId id) {
		this.id = id;
	}

	public Usuarioweb getUsuarioweb() {
		return this.usuarioweb;
	}

	public void setUsuarioweb(Usuarioweb usuarioweb) {
		this.usuarioweb = usuarioweb;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Boolean getAgregar() {
		return this.agregar;
	}

	public void setAgregar(Boolean agregar) {
		this.agregar = agregar;
	}

	public Boolean getSeleccionar() {
		return this.seleccionar;
	}

	public void setSeleccionar(Boolean seleccionar) {
		this.seleccionar = seleccionar;
	}

	public Boolean getInsertar() {
		return this.insertar;
	}

	public void setInsertar(Boolean insertar) {
		this.insertar = insertar;
	}

	public Boolean getEliminar() {
		return this.eliminar;
	}

	public void setEliminar(Boolean eliminar) {
		this.eliminar = eliminar;
	}

	public Boolean getEspecial1() {
		return this.especial1;
	}

	public void setEspecial1(Boolean especial1) {
		this.especial1 = especial1;
	}

	public Boolean getEspecial2() {
		return this.especial2;
	}

	public void setEspecial2(Boolean especial2) {
		this.especial2 = especial2;
	}

}
