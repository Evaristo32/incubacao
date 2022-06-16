package br.com.incubacao.convert;

import br.com.incubacao.domain.incubacao.ItensIncubacao;
import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.dto.incubacao.ItensIncubacaoDto;

public class ItensIncubacaoConvert {

    public static ItensIncubacao covert(ItensIncubacaoDto dto) {
        return ItensIncubacao.builder()
                .raca(Raca.builder().id(dto.getIdRaca()).build())
                .quantidadeOvosIncubados(dto.getQuantidadeOvosIncubados())
                .build();
    }

}
