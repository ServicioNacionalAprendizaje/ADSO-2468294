package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.Modulos;

public interface IModulosService {

	public List<Modulos> all();
    
    public Optional<Modulos> findById(Long id);
    
    public Modulos save(Modulos modulos);
    
    public void delete(Long id);
}
