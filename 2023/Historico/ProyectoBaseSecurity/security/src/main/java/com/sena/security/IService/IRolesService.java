package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.Roles;

public interface IRolesService {

	public List<Roles> all();
    
    public Optional<Roles> findById(Long id);
    
    public Roles save(Roles roles);
    
    public void delete(Long id);
}
