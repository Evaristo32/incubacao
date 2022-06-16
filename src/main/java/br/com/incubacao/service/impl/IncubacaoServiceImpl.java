package br.com.incubacao.service.impl;

import br.com.incubacao.convert.ItensIncubacaoConvert;
import br.com.incubacao.domain.chocadeira.Chocadeira;
import br.com.incubacao.domain.incubacao.Incubacao;
import br.com.incubacao.domain.incubacao.ItensIncubacao;
import br.com.incubacao.dto.incubacao.CadastroIncubacaoDto;
import br.com.incubacao.repository.IncubacaoRepository;
import br.com.incubacao.service.IncubacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class IncubacaoServiceImpl implements IncubacaoService {

    private final IncubacaoRepository repository;

    @Override
    public Long cadastrar(CadastroIncubacaoDto dto) {
        List<ItensIncubacao> itens = dto.getItens().stream().map(itensDto -> ItensIncubacaoConvert.covert(itensDto)).collect(Collectors.toList());

        Incubacao incubacao = Incubacao.builder()
                .chocadeira(Chocadeira.builder().id(dto.getIdChocadeira()).build())
                .inicio(dto.getDatInicioIncubacao())
                .itens(itens)
                .build();

        return repository.save(incubacao).getId();
    }

}
