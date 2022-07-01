package br.com.incubacao.domain.incubacao;

import br.com.incubacao.domain.chocadeira.Chocadeira;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Entity
@Table(name = Incubacao.TABELA, schema = "incubacao")
public class Incubacao implements Serializable {

    protected static final String TABELA = "tb_incubacao";
    protected static final String FK = "incubacao_id";
    private static final long serialVersionUID = 5988695994788665280L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_incubacao")
    @SequenceGenerator(name = "incubacao.sq_incubacao", sequenceName = "incubacao.sq_incubacao", allocationSize = 1)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = Incubacao.FK)
    private List<ItensIncubacao> itens;

    private ZonedDateTime inicio;

    private ZonedDateTime fim;

    private ZonedDateTime ovoscopia;

    @JoinColumn(name = Chocadeira.FK)
    @OneToOne(cascade = CascadeType.PERSIST)
    private Chocadeira chocadeira;

    public static IncubacaoBuild builder() {
        return new IncubacaoBuild();
    }

    public Incubacao(IncubacaoBuild build) {
        this.id = build.id;
        this.itens = build.itens;
        this.inicio = build.inicio;
        this.fim = build.fim;
        this.ovoscopia = build.dataOvoscopia;
        this.chocadeira = build.chocadeira;
    }

    public Incubacao() {

    }
}
