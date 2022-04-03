package com.gct.tp3.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cd")
public class Cd extends Document {
    private String duree;
    private String style;
    private String studio;

    public Cd() {

    }

    public Cd(String titre, String auteur, int annee, String duree, String style, String studio) {
        super(titre, auteur, annee);
        this.duree = duree;
        this.style = style;
        this.studio = studio;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
                ", style='" + style + '\'' +
                ", studio='" + studio + '\'' +
                "} " + super.toString();
    }
}
