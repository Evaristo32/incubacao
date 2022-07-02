package br.com.incubacao.service;

import br.com.incubacao.domain.incubacao.Incubacao;
import br.com.incubacao.dto.incubacao.CadastroIncubacaoDto;

import java.util.List;

public interface IncubacaoService {

    Long cadastrar(CadastroIncubacaoDto dto);

    List<Incubacao> findAll();

}
