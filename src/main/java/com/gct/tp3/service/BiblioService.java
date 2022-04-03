package com.gct.tp3.service;

import com.gct.tp3.modele.*;
import com.gct.tp3.repository.AmendeRepository;
import com.gct.tp3.repository.DocumentRepository;
import com.gct.tp3.repository.EmpruntRepository;
import com.gct.tp3.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BiblioService {

    @Autowired
    private AmendeRepository amendeRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private PersonneRepository personneRepository;

    public Client saveClient(String prenom, String nom, String username,
                             String password, String email, String telephone,
                             String rue, String codePostal, String numeroCivique) {
        return personneRepository.save(new Client(prenom, nom, username,
                password, email, telephone, rue, codePostal,
                numeroCivique, null, null));
    }

    public Livre saveLivre(String titre, String auteur, int annee, int examplaires, String editeur, String genre) {
        return documentRepository.save(new Livre(titre, auteur, annee, examplaires, editeur, genre));
    }

    public Dvd saveDvd(String titre, String auteur, int annee, int examplaires, String duree, String genre, String studio) {
        return documentRepository.save(new Dvd(titre, auteur, annee, examplaires, duree, genre, studio));
    }

    public Cd saveCd(String titre, String auteur, int annee, int examplaires, String duree, String style, String studio) {
        return documentRepository.save(new Cd(titre, auteur, annee, examplaires, duree, style, studio));
    }

    public Document findByAuteur(String auteurDocument) {
        return documentRepository.findByAuteur(auteurDocument);
    }

    public Document findByAnnee(int annee) {
        return documentRepository.findByAnnee(annee);
    }

    public Document findByTitre(String titreDocument) {
        return documentRepository.findByTitre(titreDocument);
    }
}
