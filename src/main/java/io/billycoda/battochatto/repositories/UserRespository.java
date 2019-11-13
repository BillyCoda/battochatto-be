package io.billycoda.battochatto.repositories;

import io.billycoda.battochatto.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends MongoRepository<User, String> {
}
