package br.com.incubacao.controller;


import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.raca.CadastroRaca;
import br.com.incubacao.projection.RacaProjection;
import br.com.incubacao.service.RacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/raca")
@RestController
public class RacaController {

    private final RacaService racaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroRaca dto) {
        return ResponseEntity.ok(racaService.cadastrar(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RacaProjection>> getAll() {
        return ResponseEntity.ok(racaService.getAll());
    }


    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Raca> findById(@PathVariable Long id) {
        return ResponseEntity.ok(racaService.findById(id));
    }

}
