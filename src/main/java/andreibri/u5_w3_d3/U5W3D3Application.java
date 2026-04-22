package andreibri.u5_w3_d3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U5W3D3Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W3D3Application.class, args);

//        --------------- Esercizio3 ---------------

//        Creazione ufficiali
//        Ufficiale tenente = new Tenente("Rossi");
//        Ufficiale capitano = new Capitano("Bianchi");
//        Ufficiale maggiore = new Maggiore("Verdi");
//        Ufficiale colonnello = new Colonnello("Neri");
//        Ufficiale generale = new Generale("Ferrari");

//        Costruzione della catena di responsabilità
//        tenente.setResponsabile(capitano);
//        capitano.setResponsabile(maggiore);
//        maggiore.setResponsabile(colonnello);
//        colonnello.setResponsabile(generale);

//        Test per Richieste
//        System.out.println("--- Richiesta: pattuglia ---");
//        tenente.gestisciRichiesta("pattuglia");
//
//        System.out.println("\n--- Richiesta: campagna ---");
//        tenente.gestisciRichiesta("campagna");
//
//        System.out.println("\n--- Richiesta: guerra ---");
//        tenente.gestisciRichiesta("guerra");


    }

}
