package com.sena.backedservice.Controller;

import java.util.*;

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

import com.sena.backedservice.Entity.Module;
import com.sena.backedservice.IService.IModuleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/module")
public class ModuleController {

	@Autowired
	private IModuleService service;
	
	@GetMapping
	public List<Module> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Module> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Module save(@RequestBody Module module) {
		return service.save(module);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Module update(@PathVariable Long id, @RequestBody Module module) {
		Optional<Module> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Module modulesUpdate = op.get();
			BeanUtils.copyProperties(module, modulesUpdate, "id");
            return service.save(modulesUpdate);
		}
		
		return module;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
