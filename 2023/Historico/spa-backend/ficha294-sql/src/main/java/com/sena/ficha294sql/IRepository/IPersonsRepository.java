package com.sena.ficha294sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.ficha294sql.Entity.Persons;

public interface IPersonsRepository extends JpaRepository<Persons, Integer>{

}
