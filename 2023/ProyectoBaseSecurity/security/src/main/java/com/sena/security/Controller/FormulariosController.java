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

import com.sena.security.Entity.Formularios;
import com.sena.security.IService.IFormulariosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/formularios")
public class FormulariosController {

	@Autowired
	private IFormulariosService service;
	
	@GetMapping
	public List<Formularios> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Formularios> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Formularios save(@RequestBody Formularios formularios) {
		return service.save(formularios);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public Formularios update(@PathVariable Long id, @RequestBody Formularios formularios) {
        Optional<Formularios> op = service.findById(id);

        if (op.isPresent()) {
        	Formularios formulariosUpdate = op.get();
            BeanUtils.copyProperties(formularios, formulariosUpdate, "id");
            return service.save(formulariosUpdate);
        }

        return formularios;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
