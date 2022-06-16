package br.com.incubacao.domain.racao;

public class RacaoBuild {

    protected String nome;

    protected String descricao;

    public Racao build() {
        return new Racao(this);
    }

    public RacaoBuild nome(String nome) {
        this.nome = nome;
        return this;
    }

    public RacaoBuild descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}
