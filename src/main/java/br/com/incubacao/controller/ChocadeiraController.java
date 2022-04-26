package br.com.incubacao.controller;

import br.com.incubacao.dto.chocadeira.AlterarChocadeiraDto;
import br.com.incubacao.dto.chocadeira.CadastroChocadeiraDto;
import br.com.incubacao.projection.ChocadeiraProjection;
import br.com.incubacao.service.ChocadeiraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/chocadeira")
@RestController
public class ChocadeiraController {

    private final ChocadeiraService chocadeiraService;

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroChocadeiraDto dto) {
        return ResponseEntity.ok(chocadeiraService.cadastrar(dto));
    }

    @PutMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Long> cadastrar(@RequestBody AlterarChocadeiraDto dto) {
        return ResponseEntity.ok(chocadeiraService.alterar(dto));
    }


    @GetMapping(produces = "application/json")
    public ResponseEntity<List<ChocadeiraProjection>> buscarTodos() {
        return ResponseEntity.ok(chocadeiraService.buscarTodos());
    }

    @GetMapping(path = "{id}", produces = "application/json")
    public ResponseEntity<ChocadeiraProjection> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(chocadeiraService.buscarPorId(id));
    }

    @DeleteMapping(path = "{id}", produces = "application/json")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        chocadeiraService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
