package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.Formularios;
import com.sena.security.IRepository.IFormulariosRepository;
import com.sena.security.IService.IFormulariosService;

@Service
public class FormulariosService implements IFormulariosService{

	@Autowired
	private IFormulariosRepository repository;

	@Override
	public List<Formularios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Formularios> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Formularios save(Formularios formularios) {
		return repository.save(formularios);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
