package br.com.incubacao.service.impl;

import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.raca.CadastroRaca;
import br.com.incubacao.repository.RacaRepository;
import br.com.incubacao.service.RacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RacaServiceImpl implements RacaService {

    private final RacaRepository repository;

    @Override
    public Long cadastrar(CadastroRaca dto) {

        Raca build = Raca.builder()
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .build();

        Raca raca = repository.save(build);
        return raca.getId();
    }

}
