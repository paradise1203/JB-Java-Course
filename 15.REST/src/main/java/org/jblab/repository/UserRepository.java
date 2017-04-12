package org.jblab.repository;

import org.jblab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aidar Shaifutdinov.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByEmail(String email);

}
