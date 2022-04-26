package br.com.incubacao.domain.incubacao;

import br.com.incubacao.domain.chocadeira.Chocadeira;
import lombok.Getter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Entity
@Table(name = Incubacao.TABELA, schema = "incubacao")
public class Incubacao {

    protected static final String TABELA = "tb_incubacao";
    protected static final String FK = "incubacao_id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_incubacao")
    @SequenceGenerator(name = "incubacao.sq_incubacao", sequenceName = "incubacao.sq_incubacao", allocationSize = 1)
    private Long id;

    private String especie;

    private String raca;

    private Integer quantidadeOvosIncubados;

    private Integer quantidadeOvosEclodidos;

    private ZonedDateTime inicio;

    private ZonedDateTime fim;

    @JoinColumn(name = Chocadeira.FK)
    @OneToOne(cascade = CascadeType.PERSIST)
    private Chocadeira chocadeira;


}
