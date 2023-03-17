package com.sena.ficha294sql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "views_roles")
public class ViewsRoles {
	public enum Estado {ACTIVO, INACTIVO}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Enumerated(EnumType.STRING)
	@Column(name = "estado", nullable = false, columnDefinition = "ENUM('0','1')")
	private Estado estado;

}
