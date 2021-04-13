package com.cristian.candia.codeluna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.candia.codeluna.model.Post;
import com.cristian.candia.codeluna.service.PostagensService;

@RestController
@RequestMapping("/posts")
@CrossOrigin
public class Postagens {
	
	@Autowired
	PostagensService service;
	
	@GetMapping
	public List<Post> getPostagens() {
		return service.getPostagens();
	}
	
	@PostMapping
	public Post savePost(@RequestBody Post post) {
		return service.salvarPostagem(post);
	}
	
	@GetMapping("{id}")
	public Post getPostagem(@PathVariable String id) {
		return service.getPostagem(id);
	}
}
