package br.com.incubacao.controller;

import br.com.incubacao.dto.chocadeira.AlterarChocadeiraDto;
import br.com.incubacao.dto.chocadeira.CadastroChocadeiraDto;
import br.com.incubacao.projection.ChocadeiraProjection;
import br.com.incubacao.service.ChocadeiraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/chocadeira")
@RestController
public class ChocadeiraController {

    private final ChocadeiraService chocadeiraService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = "application/json")
    public ResponseEntity<Long> create(@RequestBody CadastroChocadeiraDto dto) {
        return ResponseEntity.ok(chocadeiraService.cadastrar(dto));
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = "application/json")
    public ResponseEntity<Long> update(@RequestBody AlterarChocadeiraDto dto) {
        return ResponseEntity.ok(chocadeiraService.alterar(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ChocadeiraProjection>> buscarTodos() {
        return ResponseEntity.ok(chocadeiraService.buscarTodos());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ChocadeiraProjection> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(chocadeiraService.buscarPorId(id));
    }

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        chocadeiraService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
