package com.spring.repository;

import com.spring.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Mezzavilla
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
