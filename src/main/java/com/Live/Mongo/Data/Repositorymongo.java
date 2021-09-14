package com.Live.Mongo.Data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorymongo extends MongoRepository<MongoModel,String> {

}
