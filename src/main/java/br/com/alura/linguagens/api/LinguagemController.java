package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/linguagens")
public class LinguagemController {

	@Autowired
	private LinguagemRepository repositorio;
	
	@GetMapping
	public List<Linguagem> obterLinguagens() {
		List<Linguagem> linguagens = repositorio.findAll();
		return linguagens;
	}
	
	@GetMapping("/{name}")
	public Linguagem obterLinguagem(@PathVariable String name) {
		return repositorio.findByName(name);
	}
	
	@PostMapping
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		return repositorio.save(linguagem);
	}
	
	@DeleteMapping("/{name}")
	public Linguagem apagarLinguagem(@PathVariable String name) {
		Linguagem ling = obterLinguagem(name);
		repositorio.delete(ling);
		
		return ling;
	}
	
}
