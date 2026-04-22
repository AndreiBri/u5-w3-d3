package andreibri.u5_w3_d3.entities;

import andreibri.u5_w3_d3.chain.Ufficiale;

public class Maggiore extends Ufficiale {
    public Maggiore() {
        super("Maggiore", 3000);
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equals("operazione")) {
            System.out.println("Maggiore " + nome + " gestisce: " + richiesta);
        } else {
            successivo.gestisciRichiesta(richiesta);
        }
    }
}