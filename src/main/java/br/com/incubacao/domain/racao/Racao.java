package br.com.incubacao.domain.racao;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = Racao.TABELA, schema = "incubacao")
public class Racao implements Serializable {

    protected static final String TABELA = "tb_racao";
    protected static final String FK = "racao_id";
    private static final long serialVersionUID = 4542481789710945209L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_racao")
    @SequenceGenerator(name = "incubacao.sq_racao", sequenceName = "incubacao.sq_racao", allocationSize = 1)
    private Long id;

    private String nome;

    private String descricao;

    public Racao(RacaoBuild build) {
        this.nome = build.nome;
        this.descricao = build.descricao;
    }
}
