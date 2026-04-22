package andreibri.u5_w3_d3.entities;

import andreibri.u5_w3_d3.chain.Ufficiale;

public class Colonnello extends Ufficiale {

    public Colonnello() {
        super("Colonnello", 4000);
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equals("campagna")) {
            System.out.println("Colonnello " + nome + " gestisce: " + richiesta);
        } else {
            successivo.gestisciRichiesta(richiesta);
        }
    }
}