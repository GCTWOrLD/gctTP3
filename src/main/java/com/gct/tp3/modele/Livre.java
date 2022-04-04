package com.gct.tp3.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Livre")
public class Livre extends Document {
    private String editeur;

    public Livre() {

    }

    public Livre(String titre, String auteur, int annee, String categorie, int examplaires, String editeur) {
        super(titre, auteur, annee, categorie, examplaires);
        this.editeur = editeur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "editeur='" + editeur + '\'' +
                "} " + super.toString();
    }
}
