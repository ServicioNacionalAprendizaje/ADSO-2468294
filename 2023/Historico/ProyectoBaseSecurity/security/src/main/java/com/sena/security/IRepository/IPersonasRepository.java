package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.Personas;

@Repository
public interface IPersonasRepository  extends JpaRepository<Personas, Long> {

}
