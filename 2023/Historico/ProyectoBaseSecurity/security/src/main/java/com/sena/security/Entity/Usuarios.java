package com.sena.security.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "usuario", unique = true, nullable = false, length = 50)
    private String usuario;
	
	@Column(name = "contrasenia", length = 100)
    private String contrasenia;
	
	@Column(name = "estado")
    private Boolean estado;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false, unique = true)
    private Personas personaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Personas getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Personas personaId) {
		this.personaId = personaId;
	}	
	
	
}
