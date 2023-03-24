package com.sena.ficha294sql.Controller;

import java.util.List;
import java.util.Optional;

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

import com.sena.ficha294sql.Entity.Modules;
import com.sena.ficha294sql.IService.IModulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/modules")
public class ModulesController{
	
	@Autowired
	private IModulesService service;
	
	@GetMapping
	public List<Modules> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Modules> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Modules save(@RequestBody Modules modules) {
		return service.save(modules);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Modules update(@PathVariable Integer id, @RequestBody Modules modules) {
		Optional<Modules> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Modules modulesUpdate = op.get();
			modulesUpdate.setCode(modules.getCode());
			modulesUpdate.setDescription(modules.getDescription());
			//modulesUpdate.setStatus(modules.getStatus());
			modulesUpdate.setUserCreationId(modules.getUserCreationId());
			modulesUpdate.setUserModificationId(modules.getUserModificationId());
			//modulesUpdate.setDateCreation(modules.getDateCreation());
			//modulesUpdate.setDateModification(modules.getDateModification());
			return service.save(modulesUpdate);
		}
		
		return modules;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
