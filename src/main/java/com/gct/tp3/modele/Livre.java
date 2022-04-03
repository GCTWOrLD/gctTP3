package com.gct.tp3.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Livre")
public class Livre extends Document {
    private String editeur;
    private String genre;

    public Livre() {

    }

    public Livre(String titre, String auteur, int annee, String editeur, String genre) {
        super(titre, auteur, annee);
        this.editeur = editeur;
        this.genre = genre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "editeur='" + editeur + '\'' +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
