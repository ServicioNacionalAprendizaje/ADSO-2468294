package com.sena.security.IService;

import java.util.List;
import java.util.Optional;

import com.sena.security.Entity.UsuariosRoles;

public interface IUsuariosRolesService {

	public List<UsuariosRoles> all();
    
    public Optional<UsuariosRoles> findById(Long id);
    
    public UsuariosRoles save(UsuariosRoles usuariosRoles);
    
    public void delete(Long id);
}
