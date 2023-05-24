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
@Table(name = "roles")
public class Roles {
	
	public enum Estado {ACTIVO, INACTIVO}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column (name = "codigo", nullable = false, unique = true, length = 5)
	private Integer codigo;
	
	@Column (name = "descripcion", nullable = false, length = 50)
	private String descripcion;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "estado", nullable = false, columnDefinition = "ENUM('0','1')")
	private Estado estado;
	
	@Column (name = "usuario_creacion_id", nullable = false)
	private Integer usuario_creacion_id;
	
	@Column (name = "usuario_modificacion_id")
	private Integer usuario_modificacion;
	
	@Column (name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP")
	private Integer fecha_creacion;
	
	@Column (name = "fecha_modificacion", columnDefinition = "TIMESTAMP")
	private String fecha_modificacion;
}
