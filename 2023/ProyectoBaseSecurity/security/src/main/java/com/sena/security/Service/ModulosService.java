package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.Modulos;
import com.sena.security.IRepository.IModulosRepository;
import com.sena.security.IService.IModulosService;

@Service
public class ModulosService implements IModulosService{

	@Autowired
	private IModulosRepository repository;

	@Override
	public List<Modulos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Modulos> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Modulos save(Modulos modulos) {
		return repository.save(modulos);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
