package com.gohc.storeprocedureswitch.repository;

import com.gohc.storeprocedureswitch.model.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
}
