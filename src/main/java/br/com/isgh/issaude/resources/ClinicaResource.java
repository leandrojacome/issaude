package br.com.isgh.issaude.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clinicas")
public class ClinicaResource {

	@GetMapping
	public String list() {
		return "REST está funcionando";
	}
	
}
