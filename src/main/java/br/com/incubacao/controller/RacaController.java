package br.com.incubacao.controller;


import br.com.incubacao.dto.raca.CadastroRaca;
import br.com.incubacao.service.RacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/raca")
@RestController
public class RacaController {

    private final RacaService racaService;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Long> cadastrar(@RequestBody CadastroRaca dto) {
        return ResponseEntity.ok(racaService.cadastrar(dto));
    }

}
