package br.com.incubacao.service.impl;

import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.raca.AlterarRacaDto;
import br.com.incubacao.dto.raca.CadastroRacaDto;
import br.com.incubacao.projection.RacaProjection;
import br.com.incubacao.repository.RacaRepository;
import br.com.incubacao.service.RacaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RacaServiceImpl implements RacaService {

    private final RacaRepository repository;

    @Override
    public Long cadastrar(CadastroRacaDto dto) {

        Raca build = Raca.builder()
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .build();

        Raca raca = repository.save(build);
        return raca.getId();
    }

    @Override
    public Long update(AlterarRacaDto dto) {
        Raca raca = repository.findById(dto.getId()).get();
        raca.alterar().nome(dto.getNome()).descricao(dto.getDescricao()).aplicar();
        repository.save(raca);
        return raca.getId();
    }

    @Override
    public List<RacaProjection> getAll() {
        return repository.getAll();
    }

    @Override
    public Raca findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
