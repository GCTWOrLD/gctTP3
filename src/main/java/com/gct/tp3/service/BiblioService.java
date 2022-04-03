package com.gct.tp3.service;

import com.gct.tp3.modele.Cd;
import com.gct.tp3.modele.Client;
import com.gct.tp3.modele.Dvd;
import com.gct.tp3.modele.Livre;
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

    public Livre saveLivre(String titre, String auteur, int annee, String editeur, String genre) {
        return documentRepository.save(new Livre(titre, auteur, annee, editeur, genre));
    }

    public Dvd saveDvd(String titre, String auteur, int annee, String duree, String genre, String studio) {
        return documentRepository.save(new Dvd(titre, auteur, annee, duree, genre, studio));
    }

    public Cd saveCd(String titre, String auteur, int annee, String duree, String style, String studio) {
        return documentRepository.save(new Cd(titre, auteur, annee, duree, style, studio));
    }
}
