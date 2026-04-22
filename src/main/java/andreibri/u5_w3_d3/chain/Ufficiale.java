package andreibri.u5_w3_d3.chain;

public abstract class Ufficiale {

    protected Ufficiale successivo;
    protected String nome;
    protected double stipendio;
    protected Ufficiale responsabile;  // link al superiore

    public Ufficiale(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public Ufficiale setNext(Ufficiale successivo) {
        this.successivo = successivo;
        return successivo;
    }

    public String handle(int importo) {
        if (this.stipendio >= importo) {
            return "Il " + nome + " percepisce almeno " + importo + "€ (stipendio: " + stipendio + "€)";
        }
        if (successivo != null) {
            return successivo.handle(importo);  // passa al prossimo
        }
        return "Nessun ufficiale percepisce almeno " + importo + "€";
    }

    // ogni ufficiale implementa la propria funzione
    public abstract void gestisciRichiesta(String richiesta);

    protected void passaAlSuperiore(String richiesta) {
        if (responsabile != null) {
            System.out.println(getClass().getSimpleName() + " passa la richiesta a " + responsabile.getClass().getSimpleName());
            responsabile.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Nessuno può gestire la richiesta: " + richiesta);
        }
    }
}