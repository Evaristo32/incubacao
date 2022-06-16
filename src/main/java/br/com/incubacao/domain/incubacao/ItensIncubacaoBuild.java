package br.com.incubacao.domain.incubacao;

import br.com.incubacao.domain.raca.Raca;

public class ItensIncubacaoBuild {

    protected Long id;

    protected Raca raca;

    protected Integer quantidadeOvosIncubados;

    protected Integer quantidadeOvosEclodidos;


    public ItensIncubacao build() {
        return new ItensIncubacao(this);
    }

    public ItensIncubacaoBuild id(Long id) {
        this.id = id;
        return this;
    }

    public ItensIncubacaoBuild raca(Raca raca) {
        this.raca = raca;
        return this;
    }

    public ItensIncubacaoBuild quantidadeOvosIncubados(Integer quantidadeOvosIncubados) {
        this.quantidadeOvosIncubados = quantidadeOvosIncubados;
        return this;
    }

    public ItensIncubacaoBuild quantidadeOvosEclodidos(Integer quantidadeOvosEclodidos) {
        this.quantidadeOvosEclodidos = quantidadeOvosEclodidos;
        return this;
    }

}
