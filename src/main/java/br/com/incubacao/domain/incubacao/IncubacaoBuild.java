package br.com.incubacao.domain.incubacao;

import br.com.incubacao.domain.chocadeira.Chocadeira;

import java.time.ZonedDateTime;
import java.util.List;

public class IncubacaoBuild {

    protected Long id;

    protected List<ItensIncubacao> itens;

    protected ZonedDateTime inicio;

    protected ZonedDateTime fim;

    protected ZonedDateTime dataOvoscopia;

    protected Chocadeira chocadeira;

    public Incubacao build() {
        return new Incubacao(this);
    }

    public IncubacaoBuild id(Long id) {
        this.id = id;
        return this;
    }

    public IncubacaoBuild itens(List<ItensIncubacao> itens) {
        this.itens = itens;
        return this;
    }

    public IncubacaoBuild inicio(ZonedDateTime inicio) {
        this.inicio = inicio;
        return this;
    }

    public IncubacaoBuild fim(ZonedDateTime fim) {
        this.fim = fim;
        return this;
    }

    public IncubacaoBuild dataOvoscopia(ZonedDateTime dataOvoscopia) {
        this.dataOvoscopia = dataOvoscopia;
        return this;
    }

    public IncubacaoBuild chocadeira(Chocadeira chocadeira) {
        this.chocadeira = chocadeira;
        return this;
    }

}
