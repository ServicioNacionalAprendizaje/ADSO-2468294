package com.sena.ficha294sql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	public enum Status {ACTIVO, INACTIVO}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "usuario", nullable = false, unique = true, length = 20)
	private String usuario;
	
	@Column (name = "contrasenia", nullable = false, length = 20)
	private String contrasenia;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "estado", nullable = false, columnDefinition = "ENUM('o','1')")
	private Status status;
	
	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Integer dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private String dateModification;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false, unique = true)
    private Persons personId;
}
