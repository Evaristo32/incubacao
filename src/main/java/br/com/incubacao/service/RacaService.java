package br.com.incubacao.service;

import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.raca.AlterarRacaDto;
import br.com.incubacao.dto.raca.CadastroRacaDto;
import br.com.incubacao.projection.RacaProjection;

import java.util.List;

public interface RacaService {

    Long cadastrar(CadastroRacaDto dto);

    Long update(AlterarRacaDto dto);

    List<RacaProjection> getAll();

    Raca findById(Long id);

    void delete(Long id);
}
