package com.cristian.candia.codeluna.service;

import java.util.List;

import com.cristian.candia.codeluna.model.Post;

public interface PostagensService {
	
	public List<Post> getPostagens();
	
	public Post salvarPostagem(Post post);
	
	public Post getPostagem(String id);
}
