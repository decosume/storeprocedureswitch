package com.gohc.storeprocedureswitch.services;

import com.gohc.storeprocedureswitch.model.Document;
import com.gohc.storeprocedureswitch.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class DocumentService implements DocumentServiceI {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Optional<Document> findById(Long id) {
        return documentRepository.findById(id);
    }
}
