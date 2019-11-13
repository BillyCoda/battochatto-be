package io.billycoda.battochatto.repositories;

import io.billycoda.battochatto.models.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends MongoRepository<Channel, String> {
}
