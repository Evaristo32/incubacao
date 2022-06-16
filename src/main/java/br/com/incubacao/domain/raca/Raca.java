package br.com.incubacao.domain.raca;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = Raca.TABELA, schema = "incubacao")
public class Raca implements Serializable {

    protected static final String TABELA = "tb_raca";
    public static final String FK = "raca_id";
    private static final long serialVersionUID = 5687287929283699273L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_raca")
    @SequenceGenerator(name = "incubacao.sq_raca", sequenceName = "incubacao.sq_raca", allocationSize = 1)
    private Long id;

    private String nome;

    private String descricao;

    public Raca() {
    }

    public static RacaBuild builder() {
        return new RacaBuild();
    }

    public Raca(RacaBuild build) {
        this.nome = build.nome;
        this.descricao = build.descricao;
    }
}
