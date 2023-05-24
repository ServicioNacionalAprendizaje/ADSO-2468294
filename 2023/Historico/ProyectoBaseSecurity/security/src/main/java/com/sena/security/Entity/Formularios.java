package com.sena.security.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="formularios")
public class Formularios {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "codigo", unique = true, nullable = false, length = 50)
    private String codigo;
	
	@Column(name = "descripcion", unique = true, nullable = false, length = 50)
    private String descripcion;
	
	@Column(name = "ruta", unique = true, nullable = false, length = 50)
    private String ruta;
	
	@Column(name = "estado")
    private Boolean estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "modulo_id", nullable = false, unique = true)
    private Modulos moduloId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Modulos getModuloId() {
		return moduloId;
	}

	public void setModuloId(Modulos moduloId) {
		this.moduloId = moduloId;
	}
	
}
