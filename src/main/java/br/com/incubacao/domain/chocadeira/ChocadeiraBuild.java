package br.com.incubacao.domain.chocadeira;

public class ChocadeiraBuild {

    protected String marca;

    protected String codigo;

    protected Integer capacidadeTotal;

    public Chocadeira build() {
        return new Chocadeira(this);
    }

    public ChocadeiraBuild marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ChocadeiraBuild codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public ChocadeiraBuild capacidadeTotal(Integer capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
        return this;
    }
}
