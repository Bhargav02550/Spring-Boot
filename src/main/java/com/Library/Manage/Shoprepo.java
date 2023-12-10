package com.Library.Manage;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Shoprepo extends MongoRepository<Shop, ObjectId> {
}
