package andreibri.u5_w3_d3.entities;

import andreibri.u5_w3_d3.chain.Ufficiale;

public class Generale extends Ufficiale {

    public Generale() {
        super("Generale", 5000);
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        // il Generale gestisce tutto ciò che arriva fino a lui
        System.out.println("Generale " + nome + " gestisce: " + richiesta);
    }
}
