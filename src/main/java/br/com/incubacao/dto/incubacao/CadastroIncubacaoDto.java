package br.com.incubacao.dto.incubacao;

import br.com.incubacao.domain.chocadeira.Chocadeira;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class CadastroIncubacaoDto {

    private Long id;

    private String especie;

    private String raca;

    private Integer quantidadeOvosIncubados;

    private Integer quantidadeOvosEclodidos;

    private ZonedDateTime inicio;

    private ZonedDateTime fim;

    private Chocadeira chocadeira;

}
