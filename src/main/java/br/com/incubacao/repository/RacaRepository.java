package br.com.incubacao.repository;

import br.com.incubacao.domain.raca.Raca;
import br.com.incubacao.projection.RacaProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface RacaRepository extends JpaRepository<Raca, Long> {

    @Query(value = "select r.id, r.nome, r.descricao from Raca r")
    List<RacaProjection> getAll();
}
