package com.gct.tp3.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Client")
public class Client extends Personne {

    @OneToMany(mappedBy = "client")
    @Column(nullable = true)
    private List<Emprunt> emprunts = new ArrayList<>();

    @OneToMany(mappedBy = "client")
    @Column(nullable = true)
    private List<Amende> amendes = new ArrayList<>();
    public Client() {

    }

    public Client(String prenom, String nom, String username, String password, String email, String telephone,
                  String rue, String codePostal, String numeroCivique, List<Emprunt> emprunts, List<Amende> amendes) {
        super(prenom, nom, username, password, email, telephone, rue, codePostal, numeroCivique);
        this.emprunts = emprunts;
        this.amendes = amendes;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "emprunts=" + emprunts +
                "} " + super.toString();
    }
}
