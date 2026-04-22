package andreibri.u5_w3_d3.services;

import andreibri.u5_w3_d3.chain.Ufficiale;
import andreibri.u5_w3_d3.entities.*;
import org.springframework.stereotype.Service;

@Service
public class ChainService {

    public String verificaImporto(int importo) {
        // costruisce la catena
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        // collega la catena
        tenente.setNext(capitano)
                .setNext(maggiore)
                .setNext(colonnello)
                .setNext(generale);

        // parte sempre dal primo
        return tenente.handle(importo);
    }
}
