package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.Formularios;

public interface IFormulariosService {

	public List<Formularios> all();
    
    public Optional<Formularios> findById(Long id);
    
    public Formularios save(Formularios formularios);
    
    public void delete(Long id);
}
