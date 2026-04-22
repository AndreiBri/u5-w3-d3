package andreibri.u5_w3_d3.services;

import andreibri.u5_w3_d3.interfaces.DataSource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserData {

    private String nomeCompleto;
    private int eta;

    public Map<String, Object> getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();

        Map<String, Object> result = new HashMap<>();
        result.put("nomeCompleto", nomeCompleto);
        result.put("eta", eta);
        return result;
    }

}
