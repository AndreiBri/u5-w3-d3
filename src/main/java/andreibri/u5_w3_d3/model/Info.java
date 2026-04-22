package andreibri.u5_w3_d3.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
}