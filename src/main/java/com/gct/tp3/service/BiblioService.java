package com.gct.tp3.service;

import com.gct.tp3.modele.*;
import com.gct.tp3.repository.AmendeRepository;
import com.gct.tp3.repository.DocumentRepository;
import com.gct.tp3.repository.EmpruntRepository;
import com.gct.tp3.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public Livre saveLivre(String titre, String auteur, int annee, String categorie, int examplaires, String editeur) {
        return documentRepository.save(new Livre(titre, auteur, annee, categorie, examplaires, editeur));
    }

    public Dvd saveDvd(String titre, String auteur, int annee, String categorie, int examplaires, String duree, String studio) {
        return documentRepository.save(new Dvd(titre, auteur, annee, categorie, examplaires, duree, studio));
    }

    public Cd saveCd(String titre, String auteur, int annee, String categorie, int examplaires, String duree, String studio) {
        return documentRepository.save(new Cd(titre, auteur, annee, categorie, examplaires, duree, studio));
    }

    public List<Document> findByAuteur(String auteurDocument) {
        return documentRepository.findByAuteur(auteurDocument);
    }

    public List<Document> findByAnnee(int annee) {
        return documentRepository.findByAnnee(annee);
    }

    public List<Document> findByTitre(String titreDocument) {
        return documentRepository.findByTitre(titreDocument);
    }

    public List<Document> findByCategorie(String categorie) {
        return documentRepository.findByCategorie(categorie);
    }

    //emprunt s'il reste des examplaires (1)
    public void emprunterDocument(String nomDoucment, long idClient) {
        //todo
    }

    //retour d'un document
    public void retournerDoucment(String nomDocument, long idClient) {
        //todo
    }

    //payement des frais
    public void payerFraisRetard(long idClient) {
        //todo
    }

    //liste des emprunts + dates de retour + frais
    public void listerEmprunts(long idClient) {
        //todo
    }
}
