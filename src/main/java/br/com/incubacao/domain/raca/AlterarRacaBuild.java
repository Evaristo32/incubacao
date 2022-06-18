package br.com.incubacao.domain.raca;

import java.util.function.Consumer;

public class AlterarRacaBuild {

    protected String nome;

    protected String descricao;

    private Consumer<AlterarRacaBuild> apply;

    public AlterarRacaBuild(Consumer<AlterarRacaBuild> apply) {
        this.apply = apply;
    }

    public AlterarRacaBuild nome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlterarRacaBuild descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public void aplicar() {
        this.apply.accept(this);
    }
}
