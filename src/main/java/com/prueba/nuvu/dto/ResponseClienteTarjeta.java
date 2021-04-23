package com.prueba.nuvu.dto;

public class ResponseClienteTarjeta {

	private String status;
	private String tipoId;
	private String numeroIdentificacion;
	private long numeroTarjeta;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Override
	public String toString() {
		return "ResponseClienteTarjeta [status=" + status + ", tipoId=" + tipoId + ", numeroIdentificacion="
				+ numeroIdentificacion + ", numeroTarjeta=" + numeroTarjeta + "]";
	}

}
