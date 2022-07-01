package br.com.incubacao.dto.incubacao;

import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
public class CadastroIncubacaoDto {

    private Long idChocadeira;

    private ZonedDateTime inicio;

    List<ItensIncubacaoDto> itens;

}

