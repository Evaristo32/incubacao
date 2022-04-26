package br.com.incubacao.repository;

import br.com.incubacao.domain.chocadeira.Chocadeira;
import br.com.incubacao.projection.ChocadeiraProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface ChocadeiraRepository extends JpaRepository<Chocadeira, Long> {

    @Query(value = " SELECT c.id as id, c.marca as marca, c.codigo as codigo, c.capacidadeTotal as capacidadeTotal FROM Chocadeira c ")
    List<ChocadeiraProjection> buscarTodos();

    @Query(value = " SELECT c.id as id, c.marca as marca, c.codigo as codigo, c.capacidadeTotal as capacidadeTotal FROM Chocadeira c " +
            " WHERE c.id = :chocadeiraId")
    ChocadeiraProjection buscarPorId(@Param("chocadeiraId") Long chocadeiraId);

}
