package com.gct.tp3.modele;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Personne")
@Table(name="Personnes")
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String prenom;
    private String nom;
    private String username;
    private String password;
    private String email;
    private String telephone;
    private String rue;
    private final String VILLE = "Javatown";
    private final String PROVINCE = "QC";
    private String codePostal;
    private String numeroCivique;

    public Personne() {

    }

    public Personne(String prenom, String nom, String username, String password, String email, String telephone,
                    String rue, String codePostal, String numeroCivique) {
        this.prenom = prenom;
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.rue = rue;
        this.codePostal = codePostal;
        this.numeroCivique = numeroCivique;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVILLE() {
        return VILLE;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNumeroCivique() {
        return numeroCivique;
    }

    public void setNumeroCivique(String numeroCivique) {
        this.numeroCivique = numeroCivique;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", rue='" + rue + '\'' +
                ", VILLE='" + VILLE + '\'' +
                ", PROVINCE='" + PROVINCE + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", numeroCivique='" + numeroCivique + '\'' +
                '}';
    }
}
