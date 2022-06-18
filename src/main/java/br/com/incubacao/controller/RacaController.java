package br.com.incubacao.controller;


import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.chocadeira.AlterarChocadeiraDto;
import br.com.incubacao.dto.raca.AlterarRacaDto;
import br.com.incubacao.dto.raca.CadastroRacaDto;
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
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroRacaDto dto) {
        return ResponseEntity.ok(racaService.cadastrar(dto));
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> update(@RequestBody AlterarRacaDto dto) {
        return ResponseEntity.ok(racaService.update(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RacaProjection>> getAll() {
        return ResponseEntity.ok(racaService.getAll());
    }


    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Raca> findById(@PathVariable Long id) {
        return ResponseEntity.ok(racaService.findById(id));
    }

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        racaService.delete(id);
        return ResponseEntity.ok().build();
    }

}
