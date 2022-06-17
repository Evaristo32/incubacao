package br.com.incubacao.service;

import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.raca.CadastroRaca;
import br.com.incubacao.projection.RacaProjection;

import java.util.List;

public interface RacaService {

    Long cadastrar(CadastroRaca dto);

    List<RacaProjection> getAll();

    Raca findById(Long id);
}
