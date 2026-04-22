package andreibri.u5_w3_d3.controllers;

import andreibri.u5_w3_d3.services.ChainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ufficiali")
public class ChainController {

    private final ChainService chainService;

    public ChainController(ChainService chainService) {
        this.chainService = chainService;
    }

    @GetMapping("/stipendio/{importo}")
    public String verificaStipendio(@PathVariable int importo) {
        return chainService.verificaImporto(importo);
    }
}
