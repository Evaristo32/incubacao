package br.com.incubacao.domain.raca;

public class RacaBuild {

    protected Long id;

    protected String nome;

    protected String descricao;

    public Raca build() {
        return new Raca(this);
    }

    public RacaBuild id(Long id) {
        this.id = id;
        return this;
    }

    public RacaBuild nome(String nome) {
        this.nome = nome;
        return this;
    }

    public RacaBuild descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}
