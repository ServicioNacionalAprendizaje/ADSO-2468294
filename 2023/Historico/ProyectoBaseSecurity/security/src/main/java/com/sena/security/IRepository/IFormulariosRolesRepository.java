package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.FormulariosRoles;

@Repository
public interface IFormulariosRolesRepository  extends JpaRepository<FormulariosRoles, Long> {

}
