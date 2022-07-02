package br.com.incubacao.controller;

import br.com.incubacao.domain.incubacao.Incubacao;
import br.com.incubacao.dto.incubacao.CadastroIncubacaoDto;
import br.com.incubacao.service.IncubacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/incubacao")
@RestController
public class IncubacaoController {

    private final IncubacaoService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroIncubacaoDto dto) {
        return ResponseEntity.ok(service.cadastrar(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Incubacao>> buscarTodos() {
        return ResponseEntity.ok(service.findAll());
    }

}
