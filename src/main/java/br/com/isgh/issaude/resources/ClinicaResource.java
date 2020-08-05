package br.com.isgh.issaude.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isgh.issaude.domain.Clinica;


@RestController
@RequestMapping(value="/clinicas")
public class ClinicaResource {

	@GetMapping
	public List<Clinica> list() {
		Clinica clin1 = new Clinica(1, "Clinica 1");
		Clinica clin2 = new Clinica(2, "Clinica 2");
		
		List<Clinica> listaClinicas = new ArrayList<Clinica>();
		listaClinicas.add(clin1);
		listaClinicas.add(clin2);
		
		return listaClinicas;
	}
	
}
