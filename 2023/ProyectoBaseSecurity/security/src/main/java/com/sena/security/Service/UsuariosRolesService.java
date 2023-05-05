package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.UsuariosRoles;
import com.sena.security.IRepository.IUsuariosRolesRepository;
import com.sena.security.IService.IUsuariosRolesService;

@Service
public class UsuariosRolesService implements IUsuariosRolesService{

	@Autowired
	private IUsuariosRolesRepository repository;

	@Override
	public List<UsuariosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<UsuariosRoles> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public UsuariosRoles save(UsuariosRoles usuariosRoles) {
		return repository.save(usuariosRoles);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
