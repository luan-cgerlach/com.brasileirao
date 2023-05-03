package com.mycompany.brasileirao;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String tecnico;
    private List<Jogador> jogadores;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time() {
        jogadores = new ArrayList<>();
    }

    public Time(String nome, String tecnico, List<Jogador> jogadores, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores = new ArrayList<>();
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", tecnico=" + tecnico + ", jogadores=" + jogadores + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + '}';
    }
 
}
