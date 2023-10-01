package io.github.ruvesh.springboot3demos.observability.post.service;

import io.github.ruvesh.springboot3demos.observability.post.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();

    Post getPost(Integer id);
}
