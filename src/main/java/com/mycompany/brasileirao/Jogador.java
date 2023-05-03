package com.mycompany.brasileirao;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private Posicao posicao;

    public Jogador() {
    }

    public Jogador(String nome, int numeroCamisa, Posicao posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", numeroCamisa=" + numeroCamisa + ", posicao=" + posicao + '}';
    }
}
