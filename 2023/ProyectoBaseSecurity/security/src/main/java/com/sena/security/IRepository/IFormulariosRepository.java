package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.Formularios;

@Repository
public interface IFormulariosRepository  extends JpaRepository<Formularios, Long> {

}
