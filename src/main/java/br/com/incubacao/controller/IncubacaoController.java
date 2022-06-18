package br.com.incubacao.controller;

import br.com.incubacao.dto.incubacao.CadastroIncubacaoDto;
import br.com.incubacao.service.IncubacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/incubacao")
@RestController
public class IncubacaoController {

    private final IncubacaoService service;

    @PostMapping(path = "cadastrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroIncubacaoDto dto) {
        return ResponseEntity.ok(service.cadastrar(dto));
    }

}
