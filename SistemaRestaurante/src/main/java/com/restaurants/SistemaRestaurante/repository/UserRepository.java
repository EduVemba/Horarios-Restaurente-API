package com.restaurants.SistemaRestaurante.repository;

import com.restaurants.SistemaRestaurante.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends MongoRepository<User, String> {
    User findByEmail(String email);
}
