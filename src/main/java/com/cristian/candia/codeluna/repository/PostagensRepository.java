package com.cristian.candia.codeluna.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cristian.candia.codeluna.model.Post;

public interface PostagensRepository extends MongoRepository<Post, String>{

}
