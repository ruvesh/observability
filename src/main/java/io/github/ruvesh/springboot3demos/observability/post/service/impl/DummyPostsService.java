package io.github.ruvesh.springboot3demos.observability.post.service.impl;

import io.github.ruvesh.springboot3demos.observability.post.model.Post;
import io.github.ruvesh.springboot3demos.observability.post.service.JsonPlaceholderService;
import io.github.ruvesh.springboot3demos.observability.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyPostsService implements PostService {

    @Autowired
    JsonPlaceholderService jsonPlaceholderService;

    @Override
    public List<Post> getAllPosts() {
        return jsonPlaceholderService.findAll();
    }

    @Override
    public Post getPost(Integer id) {
        return jsonPlaceholderService.findById(id);
    }

}
