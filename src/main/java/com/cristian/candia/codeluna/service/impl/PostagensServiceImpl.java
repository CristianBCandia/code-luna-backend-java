package com.cristian.candia.codeluna.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.candia.codeluna.exceptions.RetornoVazioException;
import com.cristian.candia.codeluna.model.Post;
import com.cristian.candia.codeluna.repository.PostagensRepository;
import com.cristian.candia.codeluna.service.PostagensService;

@Service
public class PostagensServiceImpl implements PostagensService{
	
	@Autowired
	PostagensRepository repository;
	
	@Override
	public List<Post> getPostagens() {
		return repository.findAll();
	}

	@Override
	public Post salvarPostagem(Post post) {
		return repository.save(post);
	}

	@Override
	public Post getPostagem(String id) {
		Optional<Post> post = repository.findById(id);
		if(!post.isPresent() || post.isEmpty()) {
			throw new RetornoVazioException("Postagem vazia!");
		}
		return post.get();
	}
	
	

}
