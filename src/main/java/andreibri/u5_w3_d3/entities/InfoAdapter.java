package andreibri.u5_w3_d3.entities;

import andreibri.u5_w3_d3.interfaces.DataSource;
import andreibri.u5_w3_d3.model.Info;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {

    private final Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return Period.between(info.getDataDiNascita(), LocalDate.now()).getYears();
    }
}