package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

/**
 * PuntosId generated by hbm2java
 */
public class PuntosId implements java.io.Serializable {

	private int idtransaccion;
	private String idcliente;
	private String nacionalidad;

	public PuntosId() {
	}

	public PuntosId(int idtransaccion, String idcliente, String nacionalidad) {
		this.idtransaccion = idtransaccion;
		this.idcliente = idcliente;
		this.nacionalidad = nacionalidad;
	}

	public int getIdtransaccion() {
		return this.idtransaccion;
	}

	public void setIdtransaccion(int idtransaccion) {
		this.idtransaccion = idtransaccion;
	}

	public String getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PuntosId))
			return false;
		PuntosId castOther = (PuntosId) other;

		return (this.getIdtransaccion() == castOther.getIdtransaccion())
				&& ((this.getIdcliente() == castOther.getIdcliente()) || (this
						.getIdcliente() != null
						&& castOther.getIdcliente() != null && this
						.getIdcliente().equals(castOther.getIdcliente())))
				&& ((this.getNacionalidad() == castOther.getNacionalidad()) || (this
						.getNacionalidad() != null
						&& castOther.getNacionalidad() != null && this
						.getNacionalidad().equals(castOther.getNacionalidad())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdtransaccion();
		result = 37 * result
				+ (getIdcliente() == null ? 0 : this.getIdcliente().hashCode());
		result = 37
				* result
				+ (getNacionalidad() == null ? 0 : this.getNacionalidad()
						.hashCode());
		return result;
	}

}
