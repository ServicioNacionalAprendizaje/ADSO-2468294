package com.sena.security.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.security.Entity.Modulos;

@Repository
public interface IModulosRepository  extends JpaRepository<Modulos, Long> {

}
