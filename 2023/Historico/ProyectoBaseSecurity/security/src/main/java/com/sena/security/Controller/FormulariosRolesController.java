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

import com.sena.security.Entity.FormulariosRoles;
import com.sena.security.IService.IFormulariosRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/security/formulariosRoles")
public class FormulariosRolesController {

	@Autowired
	private IFormulariosRolesService service;
	
	@GetMapping
	public List<FormulariosRoles> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<FormulariosRoles> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public FormulariosRoles save(@RequestBody FormulariosRoles formulariosRoles) {
		return service.save(formulariosRoles);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	 public FormulariosRoles update(@PathVariable Long id, @RequestBody FormulariosRoles formulariosRoles) {
        Optional<FormulariosRoles> op = service.findById(id);

        if (op.isPresent()) {
        	FormulariosRoles formulariosRolesUpdate = op.get();
            BeanUtils.copyProperties(formulariosRoles, formulariosRolesUpdate, "id");
            return service.save(formulariosRolesUpdate);
        }

        return formulariosRoles;
    }
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
