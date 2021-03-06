package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tipoemail generated by hbm2java
 */
public class Tipoemail implements java.io.Serializable {

	private Integer idtipoemail;
	private String descripcion;
	private Set emailbroadcasts = new HashSet(0);
	private Set emailenvios = new HashSet(0);

	public Tipoemail() {
	}

	public Tipoemail(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipoemail(String descripcion, Set emailbroadcasts, Set emailenvios) {
		this.descripcion = descripcion;
		this.emailbroadcasts = emailbroadcasts;
		this.emailenvios = emailenvios;
	}

	public Integer getIdtipoemail() {
		return this.idtipoemail;
	}

	public void setIdtipoemail(Integer idtipoemail) {
		this.idtipoemail = idtipoemail;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getEmailbroadcasts() {
		return this.emailbroadcasts;
	}

	public void setEmailbroadcasts(Set emailbroadcasts) {
		this.emailbroadcasts = emailbroadcasts;
	}

	public Set getEmailenvios() {
		return this.emailenvios;
	}

	public void setEmailenvios(Set emailenvios) {
		this.emailenvios = emailenvios;
	}

}
