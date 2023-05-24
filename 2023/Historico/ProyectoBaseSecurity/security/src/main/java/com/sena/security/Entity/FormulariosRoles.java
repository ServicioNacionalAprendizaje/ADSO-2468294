package com.sena.security.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="formularios_roles")
public class FormulariosRoles {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false, unique = true)
    private Roles rolId;

	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Formularios formularioId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Roles getRolId() {
		return rolId;
	}


	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}


	public Formularios getFormularioId() {
		return formularioId;
	}


	public void setFormularioId(Formularios formularioId) {
		this.formularioId = formularioId;
	}

}
