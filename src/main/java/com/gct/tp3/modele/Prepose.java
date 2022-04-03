package com.gct.tp3.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Prepose")
public class Prepose extends Personne {

    public Prepose() {

    }
}
