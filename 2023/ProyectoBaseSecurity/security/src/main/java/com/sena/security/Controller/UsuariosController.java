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

import com.sena.security.Entity.Usuarios;
import com.sena.security.IService.IUsuariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/usuarios")
public class UsuariosController {

	@Autowired
	private IUsuariosService service;
	
	@GetMapping
	public List<Usuarios> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Usuarios> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuarios save(@RequestBody Usuarios usuarios) {
		return service.save(usuarios);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Usuarios update(@PathVariable Long id, @RequestBody Usuarios usuarios) {
        Optional<Usuarios> op = service.findById(id);

        if (op.isPresent()) {
        	Usuarios usuariosUpdate = op.get();
            BeanUtils.copyProperties(usuarios, usuariosUpdate, "id");
            return service.save(usuariosUpdate);
        }

        return usuarios;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
