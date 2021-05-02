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
public class DocumentService implements DocumentRepository {

    @Autowired
    DocumentRepository documentRepository;

    public com.gohc.storeprocedureswitch.model.Document addDocument(com.gohc.storeprocedureswitch.model.Document document) {
        return this.documentRepository.save(document);
    }

    @Override
    public <S extends Document> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Document> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Document> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Document> findAll() {
        return null;
    }

    @Override
    public Iterable<Document> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Document entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Document> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
