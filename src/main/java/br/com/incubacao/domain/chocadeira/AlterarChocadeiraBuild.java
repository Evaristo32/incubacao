package br.com.incubacao.domain.chocadeira;

import java.util.function.Consumer;

public class AlterarChocadeiraBuild {

    protected String marca;

    protected Integer capacidadeTotal;

    private Consumer<AlterarChocadeiraBuild> apply;

    public AlterarChocadeiraBuild(Consumer<AlterarChocadeiraBuild> apply) {
        this.apply = apply;
    }

    public AlterarChocadeiraBuild marca(String marca) {
        this.marca = marca;
        return this;
    }

    public AlterarChocadeiraBuild capacidadeTotal(Integer capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
        return this;
    }

    public void aplicar() {
        this.apply.accept(this);
    }
}
