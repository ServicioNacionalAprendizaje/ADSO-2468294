package com.sena.ficha294sql.IService;

import java.util.List;
import java.util.Optional;

import com.sena.ficha294sql.Entity.Modules;

public interface IModulesService {
	
	public List<Modules> all();
	    
    public Optional<Modules> findById(Integer id);
    
    public Modules save(Modules modules);
    
    public void delete(Integer id);
}
