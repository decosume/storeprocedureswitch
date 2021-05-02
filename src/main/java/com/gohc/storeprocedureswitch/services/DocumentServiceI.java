package com.gohc.storeprocedureswitch.services;

import com.gohc.storeprocedureswitch.model.Document;

import java.util.Optional;

public interface DocumentServiceI {
    Optional<Document> findById(Long id);
}
