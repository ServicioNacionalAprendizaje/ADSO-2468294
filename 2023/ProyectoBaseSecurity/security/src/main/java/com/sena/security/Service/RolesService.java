package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.Roles;
import com.sena.security.IRepository.IRolesRepository;
import com.sena.security.IService.IRolesService;

@Service
public class RolesService implements IRolesService{

	@Autowired
	private IRolesRepository repository;

	@Override
	public List<Roles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Roles> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Roles save(Roles roles) {
		return repository.save(roles);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
