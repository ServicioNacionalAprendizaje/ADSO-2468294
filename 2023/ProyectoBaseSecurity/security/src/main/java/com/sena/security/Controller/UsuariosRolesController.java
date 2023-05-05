package com.sena.security.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sena.security.Entity.UsuariosRoles;
import com.sena.security.IService.IUsuariosRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/usuariosRoles")
public class UsuariosRolesController {

	@Autowired
	private IUsuariosRolesService service;
	
	@GetMapping
	public List<UsuariosRoles> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<UsuariosRoles> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public UsuariosRoles save(@RequestBody UsuariosRoles usuariosRoles) {
		return service.save(usuariosRoles);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public UsuariosRoles update(@PathVariable Long id, @RequestBody UsuariosRoles usuariosRoles) {
        Optional<UsuariosRoles> op = service.findById(id);

        if (op.isPresent()) {
        	UsuariosRoles usuariosRolesUpdate = op.get();
            BeanUtils.copyProperties(usuariosRoles, usuariosRolesUpdate, "id");
            return service.save(usuariosRolesUpdate);
        }

        return usuariosRoles;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
