package com.prueba.nuvu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TarjetaCredito {

	@Id
	private Long numeroTarjeta;
	@Column(nullable = false)
	private String franquicia;
	@Column(nullable = false)
	private String categoria;
	@Column(nullable = false)
	private String entidadEmisora;
	@Column(nullable = false)
	private int codigoVerificacion;
	@Column(nullable = false)
	private String fechaEmision;
	@Column(nullable = false)
	private String fechaCaducidad;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumns({ @JoinColumn(name =
	 * "id_identificacion",referencedColumnName="id_identificacion", unique = true,
	 * nullable = false),
	 * 
	 * @JoinColumn(name =
	 * "tipo_identificacion",referencedColumnName="tipo_identificacion", unique =
	 * true, nullable = false),
	 * 
	 * @JoinColumn(name =
	 * "numero_identificacion",referencedColumnName="numero_identificacion", unique
	 * = true, nullable = false)}) private Cliente cliente;
	 */
	public TarjetaCredito() {
		super();
	}

	public TarjetaCredito(Long numeroTarjeta, String franquicia, String categoria, String entidadEmisora,
			int codigoVerificacion, String fechaEmision, String fechaCaducidad) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.franquicia = franquicia;
		this.categoria = categoria;
		this.entidadEmisora = entidadEmisora;
		this.codigoVerificacion = codigoVerificacion;
		this.fechaEmision = fechaEmision;
		this.fechaCaducidad = fechaCaducidad;
	}

	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEntidadEmisora() {
		return entidadEmisora;
	}

	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	public int getCodigoVerificacion() {
		return codigoVerificacion;
	}

	public void setCodigoVerificacion(int codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numeroTarjeta=" + numeroTarjeta + ", franquicia=" + franquicia + ", categoria="
				+ categoria + ", entidadEmisora=" + entidadEmisora + ", codigoVerificacion=" + codigoVerificacion
				+ ", fechaEmision=" + fechaEmision + ", fechaCaducidad=" + fechaCaducidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaCredito other = (TarjetaCredito) obj;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		return true;
	}

}
