package com.gct.tp3.repository;

import com.gct.tp3.modele.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByAuteur(String auteurDocument);
    Document findByAnnee(int annee);
}
