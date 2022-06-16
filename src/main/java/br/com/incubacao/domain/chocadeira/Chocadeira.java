package br.com.incubacao.domain.chocadeira;


import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = Chocadeira.TABELA, schema = "incubacao")
public class Chocadeira implements Serializable {

    protected static final String TABELA = "tb_chocadeira";
    public static final String FK = "chocadeira_id";
    private static final long serialVersionUID = -3806664269007549862L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incubacao.sq_chocadeira")
    @SequenceGenerator(name = "incubacao.sq_chocadeira", sequenceName = "incubacao.sq_chocadeira", allocationSize = 1)
    private Long id;

    private String marca;

    private String codigo;

    private Integer capacidadeTotal;

    public Chocadeira() {
    }

    public static ChocadeiraBuild builder() {
        return new ChocadeiraBuild();
    }

    public AlterarChocadeiraBuild alterar() {
        return new AlterarChocadeiraBuild(
                form -> {
                    this.marca = form.marca;
                    this.capacidadeTotal = form.capacidadeTotal;
                }
        );
    }

    public Chocadeira(ChocadeiraBuild build) {
        this.marca = build.marca;
        this.codigo = build.codigo;
        this.capacidadeTotal = build.capacidadeTotal;
    }

}
