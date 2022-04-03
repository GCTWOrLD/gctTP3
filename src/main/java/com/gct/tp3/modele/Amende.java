package com.gct.tp3.modele;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="Amendes")
public class Amende {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private BigDecimal montant;
    private LocalDateTime dateRetard;
    private int nbDeJoursEnRetard;
    private String nomDuDocument;
    @ManyToOne
    @JoinColumn(name = "Client_ID")
    private Client client;

    public Amende() {

    }

    public Amende(BigDecimal montant, LocalDateTime dateRetard, int nbDeJoursEnRetard, String nomDuDocument, Client client) {
        this.montant = montant;
        this.dateRetard = dateRetard;
        this.nbDeJoursEnRetard = nbDeJoursEnRetard;
        this.nomDuDocument = nomDuDocument;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDateTime getDateRetard() {
        return dateRetard;
    }

    public void setDateRetard(LocalDateTime dateRetard) {
        this.dateRetard = dateRetard;
    }

    public int getNbDeJoursEnRetard() {
        return nbDeJoursEnRetard;
    }

    public void setNbDeJoursEnRetard(int nbDeJoursEnRetard) {
        this.nbDeJoursEnRetard = nbDeJoursEnRetard;
    }

    public String getNomDuDocument() {
        return nomDuDocument;
    }

    public void setNomDuDocument(String nomDuDocument) {
        this.nomDuDocument = nomDuDocument;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Amende{" +
                "id=" + id +
                ", montant=" + montant +
                ", dateRetard=" + dateRetard +
                ", nbDeJoursEnRetard=" + nbDeJoursEnRetard +
                ", nomDuDocument='" + nomDuDocument + '\'' +
                ", client=" + client +
                '}';
    }
}
