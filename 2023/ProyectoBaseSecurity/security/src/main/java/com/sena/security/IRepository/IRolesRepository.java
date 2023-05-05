package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.Roles;

@Repository
public interface IRolesRepository  extends JpaRepository<Roles, Long> {

}
