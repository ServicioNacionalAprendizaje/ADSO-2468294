package com.sena.security.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.security.Entity.Usuarios;
import com.sena.security.IRepository.IUsuariosRepository;
import com.sena.security.IService.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{

	@Autowired
	private IUsuariosRepository repository;

	@Override
	public List<Usuarios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {
		return repository.save(usuarios);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}	
}
