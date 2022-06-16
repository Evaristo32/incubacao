package br.com.incubacao.controller;


import br.com.incubacao.dto.raca.CadastroRaca;
import br.com.incubacao.projection.RacaProjection;
import br.com.incubacao.service.RacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/raca")
@RestController
public class RacaController {

    private final RacaService racaService;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroRaca dto) {
        return ResponseEntity.ok(racaService.cadastrar(dto));
    }

    @GetMapping(consumes = "application/json")
    public ResponseEntity<List<RacaProjection>> getAll() {
        return ResponseEntity.ok(racaService.getAll());
    }

}
