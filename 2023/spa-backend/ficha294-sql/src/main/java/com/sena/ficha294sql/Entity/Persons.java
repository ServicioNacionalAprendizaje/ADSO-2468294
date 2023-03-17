package com.sena.ficha294sql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "persons")
public class Persons{
	
	public enum DocumentType{CE, CC, TI, PP, DNI}
	public enum Gender{Femenino, Masculino}
	public enum Status{Activo, Inactivo}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "document_type", nullable = false, length = 5)
    private DocumentType documentType;
	
	@Column(name = "document", nullable = false, unique = true, length = 12)
    private String document;
	
	@Column(name= "first_name", nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "second_name", nullable = false, length = 20)
	private String secondName;
	
	@Column (name = "first_last_name", nullable = false, length = 20)
	private String firstLastName;
	
	@Column (name = "second_last_name", nullable = false, length = 20)
	private String secondLastName;
	
	@Column (name = "age", nullable = false, length = 2)
	private Integer age;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "gender", nullable = false, columnDefinition = "ENUM('Femenino', 'Masculino')")
	private Gender gender;
	
	@Column (name = "mail", nullable = false, length = 30)
	private String mail;
	
	@Column(name = "phone_number", nullable = false, length = 10)
	private Integer phoneNumber;
	
	@Column (name = "address", nullable = false, length = 30)
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "status", nullable = false, columnDefinition = "ENUM('0','1')")
	private Status status;

	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Integer dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private String dateModification;

}
