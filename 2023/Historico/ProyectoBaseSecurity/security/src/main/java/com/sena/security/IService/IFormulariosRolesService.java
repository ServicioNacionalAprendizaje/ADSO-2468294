package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.FormulariosRoles;

public interface IFormulariosRolesService {

	public List<FormulariosRoles> all();
    
    public Optional<FormulariosRoles> findById(Long id);
    
    public FormulariosRoles save(FormulariosRoles formulariosRoles);
    
    public void delete(Long id);
}
