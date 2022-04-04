package com.gct.tp3.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cd")
public class Cd extends Document {
    private String duree;
    private String studio;

    public Cd() {

    }

    public Cd(String titre, String auteur, int annee, String categorie, int examplaires, String duree, String studio) {
        super(titre, auteur, annee, categorie, examplaires);
        this.duree = duree;
        this.studio = studio;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "duree='" + duree + '\'' +
                ", studio='" + studio + '\'' +
                "} " + super.toString();
    }
}
