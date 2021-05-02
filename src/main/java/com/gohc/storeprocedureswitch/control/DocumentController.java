package com.gohc.storeprocedureswitch.control;


import com.gohc.storeprocedureswitch.exception.ResourceNotFoundException;
import com.gohc.storeprocedureswitch.model.Document;
import com.gohc.storeprocedureswitch.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping("/document/{id}")
    public ResponseEntity<Document> getDocumentById(@PathVariable(value = "id") Long documentId)
            throws ResourceNotFoundException  {
        System.out.println("documentId "+ documentId);
        Document doc = documentRepository.findById(documentId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + documentId));
        return ResponseEntity.ok().body(doc);
    }
    @PostMapping("/document")
    public Document createDocument(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

}
