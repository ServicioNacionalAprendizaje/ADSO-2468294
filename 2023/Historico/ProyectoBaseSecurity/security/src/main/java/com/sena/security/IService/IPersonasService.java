package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.Personas;

public interface IPersonasService {

	public List<Personas> all();
    
    public Optional<Personas> findById(Long id);
    
    public Personas save(Personas personas);
    
    public void delete(Long id);
}
