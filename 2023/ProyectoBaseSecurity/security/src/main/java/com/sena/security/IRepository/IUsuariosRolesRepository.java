package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.UsuariosRoles;

@Repository
public interface IUsuariosRolesRepository  extends JpaRepository<UsuariosRoles, Long> {

}
