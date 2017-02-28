package org.jblab.repository;

import org.jblab.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aidar Shaifutdinov.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
