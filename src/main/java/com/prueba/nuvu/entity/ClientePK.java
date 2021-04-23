package com.prueba.nuvu.entity;

import java.io.Serializable;

public class ClientePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 230124407642007688L;

	private String tipoIdentificacion;
	private int numeroIdentificacion;

	public ClientePK() {
		super();
	}

	public ClientePK(String tipoIdentificacion, int numeroIdentificacion) {
		super();
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroIdentificacion;
		result = prime * result + ((tipoIdentificacion == null) ? 0 : tipoIdentificacion.hashCode());
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
		ClientePK other = (ClientePK) obj;
		if (numeroIdentificacion != other.numeroIdentificacion)
			return false;
		if (tipoIdentificacion == null) {
			if (other.tipoIdentificacion != null)
				return false;
		} else if (!tipoIdentificacion.equals(other.tipoIdentificacion))
			return false;
		return true;
	}

}
