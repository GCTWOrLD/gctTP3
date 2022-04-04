package com.gct.tp3.repository;

import com.gct.tp3.modele.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByAuteur(String auteurDocument);
    Document findByAnnee(int annee);

    @Query("select d from Document d where d.titre like %:titreDocument%")
    Document findByTitre(@Param("titreDocument")String text);

    Document findByCategorie(String categorie);
}
