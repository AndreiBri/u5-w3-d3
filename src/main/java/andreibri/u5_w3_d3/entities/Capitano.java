package andreibri.u5_w3_d3.entities;


import andreibri.u5_w3_d3.chain.Ufficiale;

public class Capitano extends Ufficiale {

    public Capitano() {
        super("Capitano", 2000);
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if (richiesta.equals("missione")) {
            System.out.println("Capitano " + nome + " gestisce: " + richiesta);
        } else {
            successivo.gestisciRichiesta(richiesta);
        }
    }
}