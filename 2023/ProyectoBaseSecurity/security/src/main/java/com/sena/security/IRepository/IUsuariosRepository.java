package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.Usuarios;

@Repository
public interface IUsuariosRepository  extends JpaRepository<Usuarios, Long> {

}
