package com.gct.tp3.modele;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Document")
@Table(name="Documents")
public abstract class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titre;
    private String auteur;
    private int annee;
    private int examplaires;

    public Document() {

    }

    public Document(String titre, String auteur, int annee, int examplaires) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.examplaires = examplaires;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getExamplaires() {
        return examplaires;
    }

    public void setExamplaires(int examplaires) {
        this.examplaires = examplaires;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee='" + annee + '\'' +
                '}';
    }
}
