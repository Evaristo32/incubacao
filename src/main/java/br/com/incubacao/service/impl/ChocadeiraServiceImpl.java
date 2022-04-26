package br.com.incubacao.service.impl;

import br.com.incubacao.domain.chocadeira.Chocadeira;
import br.com.incubacao.dto.chocadeira.AlterarChocadeiraDto;
import br.com.incubacao.dto.chocadeira.CadastroChocadeiraDto;
import br.com.incubacao.projection.ChocadeiraProjection;
import br.com.incubacao.repository.ChocadeiraRepository;
import br.com.incubacao.service.ChocadeiraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ChocadeiraServiceImpl implements ChocadeiraService {

    private final ChocadeiraRepository repository;

    @Transactional
    @Override
    public Long cadastrar(CadastroChocadeiraDto dto) {

        Chocadeira build = Chocadeira.builder()
                .codigo(dto.getCodigo())
                .marca(dto.getMarca())
                .capacidadeTotal(dto.getCapacidadeTotal())
                .build();
        Chocadeira chocadeira = repository.save(build);

        return chocadeira.getId();
    }


    @Transactional
    @Override
    public Long alterar(AlterarChocadeiraDto dto) {

        Optional<Chocadeira> opChocadeira = repository.findById(dto.getId());
        if (opChocadeira.isPresent()) {
            Chocadeira chocadeira = opChocadeira.get();
            chocadeira.alterar().marca(dto.getMarca()).capacidadeTotal(dto.getCapacidadeTotal()).aplicar();
            return repository.save(chocadeira).getId();
        }
        return null;
    }

    @Override
    public List<ChocadeiraProjection> buscarTodos() {
        return repository.buscarTodos();
    }

    @Override
    public ChocadeiraProjection buscarPorId(Long id) {
        return repository.buscarPorId(id);
    }

    @Transactional
    @Override
    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
