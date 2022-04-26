package br.com.incubacao.service;

import br.com.incubacao.dto.chocadeira.AlterarChocadeiraDto;
import br.com.incubacao.dto.chocadeira.CadastroChocadeiraDto;
import br.com.incubacao.projection.ChocadeiraProjection;

import java.util.List;

public interface ChocadeiraService {

    Long cadastrar(CadastroChocadeiraDto dto);

    Long alterar(AlterarChocadeiraDto dto);

    List<ChocadeiraProjection> buscarTodos();

    ChocadeiraProjection buscarPorId(Long id);

    void excluir(Long id);
}
