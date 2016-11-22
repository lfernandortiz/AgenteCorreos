package com.dromedicas.dto;

// Generated 31/10/2016 11:16:26 AM by Hibernate Tools 3.4.0.CR1

/**
 * ContratoId generated by hbm2java
 */
public class ContratoId implements java.io.Serializable {

	private int idcontrato;
	private int idempresa;

	public ContratoId() {
	}

	public ContratoId(int idcontrato, int idempresa) {
		this.idcontrato = idcontrato;
		this.idempresa = idempresa;
	}

	public int getIdcontrato() {
		return this.idcontrato;
	}

	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}

	public int getIdempresa() {
		return this.idempresa;
	}

	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContratoId))
			return false;
		ContratoId castOther = (ContratoId) other;

		return (this.getIdcontrato() == castOther.getIdcontrato())
				&& (this.getIdempresa() == castOther.getIdempresa());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdcontrato();
		result = 37 * result + this.getIdempresa();
		return result;
	}

}
