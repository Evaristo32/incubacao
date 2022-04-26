package br.com.incubacao.repository;

import br.com.incubacao.domain.incubacao.Incubacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface IncubacaoRepository extends JpaRepository<Incubacao, Long> {
}
