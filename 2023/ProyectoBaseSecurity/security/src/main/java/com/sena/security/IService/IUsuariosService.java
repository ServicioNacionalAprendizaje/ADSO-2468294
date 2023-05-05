package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> all();
    
    public Optional<Usuarios> findById(Long id);
    
    public Usuarios save(Usuarios usuarios);
    
    public void delete(Long id);
}
