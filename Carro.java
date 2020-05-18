package com.fatec;

public class Carro {
    private String nome;
    private double preco;
     public Carro( String nome, double preço) {
         this.setNome(nome);
         this.setPreco(preço);
     }

    public Carro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
