package andreibri.u5_w3_d3.entities;

import andreibri.u5_w3_d3.chain.Ufficiale;

public class Tenente extends Ufficiale {
    public Tenente() {
        super("Tenente", 1000);
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equals("pattuglia")) {
            System.out.println("Tenente " + nome + " gestisce: " + richiesta);
        } else {
            successivo.gestisciRichiesta(richiesta);
        }
    }
}