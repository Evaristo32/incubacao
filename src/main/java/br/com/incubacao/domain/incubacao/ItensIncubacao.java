package br.com.incubacao.domain.incubacao;

import br.com.incubacao.domain.raca.Raca;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = ItensIncubacao.TABELA, schema = "incubacao")
public class ItensIncubacao {

    protected static final String TABELA = "tb_itens_incubacao";
    protected static final String FK = "itens_incubacao_id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_itens_incubacao")
    @SequenceGenerator(name = "incubacao.sq_itens_incubacao", sequenceName = "incubacao.sq_itens_incubacao", allocationSize = 1)
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = Raca.FK)
    private Raca raca;

    private Integer quantidadeOvosIncubados;

    private Integer quantidadeOvosEclodidos;

    public static ItensIncubacaoBuild builder() {
        return new ItensIncubacaoBuild();
    }

    public ItensIncubacao() {
    }

    public ItensIncubacao(ItensIncubacaoBuild build) {
        this.id = build.id;
        this.raca = build.raca;
        this.quantidadeOvosIncubados = build.quantidadeOvosIncubados;
        this.quantidadeOvosEclodidos = build.quantidadeOvosEclodidos;
    }
}
