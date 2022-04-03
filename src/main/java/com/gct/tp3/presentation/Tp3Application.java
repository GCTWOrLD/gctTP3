package com.gct.tp3.presentation;

import com.gct.tp3.modele.Cd;
import com.gct.tp3.modele.Client;
import com.gct.tp3.modele.Dvd;
import com.gct.tp3.modele.Livre;
import com.gct.tp3.service.BiblioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp3Application implements CommandLineRunner {

    @Autowired
    private BiblioService service;

    public static void main(String[] args) {
        SpringApplication.run(Tp3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        final Client client1 = service.saveClient("Gabriel", "Caron-Tawil", "GCT",
                "password", "gct@gmail.com",
                "514-704-1694", "147", "J6K 4L5", "104");

        final Livre livre1 = service.saveLivre("Math 101", "Paul Laroche", 1999, "Éditions Soleil", "Roman");

        final Dvd dvd1 = service.saveDvd("Star Wars 1", "George Lucas", 2000, "2h00", "Science-Fiction", "LucasArts");

        final Cd cd1 = service.saveCd("Discovery", "Daft Punk", 2001, "1h01", "Electronique", "Warner Music France");
    }

}
