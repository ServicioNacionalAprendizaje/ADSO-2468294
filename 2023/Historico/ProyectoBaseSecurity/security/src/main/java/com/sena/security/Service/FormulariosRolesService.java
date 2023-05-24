package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.FormulariosRoles;
import com.sena.security.IRepository.IFormulariosRolesRepository;
import com.sena.security.IService.IFormulariosRolesService;

@Service
public class FormulariosRolesService implements IFormulariosRolesService{

	@Autowired
	private IFormulariosRolesRepository repository;

	@Override
	public List<FormulariosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<FormulariosRoles> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public FormulariosRoles save(FormulariosRoles formulariosRoles) {
		return repository.save(formulariosRoles);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
