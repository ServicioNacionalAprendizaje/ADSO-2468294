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

import com.sena.security.Entity.Modulos;
import com.sena.security.IService.IModulosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/modulos")
public class ModulosController {

	@Autowired
	private IModulosService service;
	
	@GetMapping
	public List<Modulos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Modulos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Modulos save(@RequestBody Modulos modulos) {
		return service.save(modulos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Modulos update(@PathVariable Long id, @RequestBody Modulos modulos) {
        Optional<Modulos> op = service.findById(id);

        if (op.isPresent()) {
        	Modulos modulosUpdate = op.get();
            BeanUtils.copyProperties(modulos, modulosUpdate, "id");
            return service.save(modulosUpdate);
        }

        return modulos;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
