package com.doc.repository;

import com.doc.model.DocumentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentDetailsRepository extends MongoRepository<DocumentDetails, String> {
}
