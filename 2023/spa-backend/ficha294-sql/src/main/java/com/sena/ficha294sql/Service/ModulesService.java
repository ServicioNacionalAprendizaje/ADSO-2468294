package com.sena.ficha294sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ficha294sql.Entity.Modules;
import com.sena.ficha294sql.IRepository.IModulesRepository;
import com.sena.ficha294sql.IService.IModulesService;

@Service
public class ModulesService implements IModulesService{
	
	@Autowired
	private IModulesRepository repository;

	@Override
	public List<Modules> all() {		
		return repository.findAll();
	}

	@Override
	public Optional<Modules> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Modules save(Modules modules) {
		return repository.save(modules);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);		
	}
}
