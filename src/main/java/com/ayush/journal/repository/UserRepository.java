package com.ayush.journal.repository;

import com.ayush.journal.entity.JournalEntry;
import com.ayush.journal.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    List<JournalEntry> id(ObjectId id);
}