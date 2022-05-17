package com.jobiak.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mongo.model.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student,Long> {

}
