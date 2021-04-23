package com.prueba.nuvu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
@IdClass(ClientePK.class)
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7924914120586130473L;
	
	@Id
	@Column(name = "tipo_identificacion")
	private String tipoIdentificacion;
	@Id
	@Column(name = "numero_identificacion")
	private int numeroIdentificacion;
	
	@Column(nullable = false)
	private String primerNombre;
	private String segundoNombre;
	@Column(nullable = false)
	private String primerApellido;
	private String segundoApellido;
	@Column(nullable = false)
	private String email;
	private String celular;
	private String salario;

	@OneToMany(cascade = CascadeType.ALL)
	private List<TarjetaCredito> tarjetaCredito;

	public Cliente() {
		super();
	}

	public Cliente(String tipoIdentificacion, int numeroIdentificacion, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido, String email, String celular, String salario,
			List<TarjetaCredito> tarjetaCredito) {
		super();
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.email = email;
		this.celular = celular;
		this.salario = salario;
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<TarjetaCredito> getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(List<TarjetaCredito> tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	@Override
	public String toString() {
		return "Cliente [tipoIdentificacion=" + tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion
				+ ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", email=" + email + ", celular=" + celular
				+ ", salario=" + salario + ", tarjetaCredito=" + tarjetaCredito + "]";
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
		Cliente other = (Cliente) obj;
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
