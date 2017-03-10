package org.jblab.service.impl;

import org.jblab.model.Post;
import org.jblab.repository.PostRepository;
import org.jblab.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Aidar Shaifutdinov.
 */
@Service
@Transactional
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void add(Post post) {
        postRepository.save(post);
    }

}
