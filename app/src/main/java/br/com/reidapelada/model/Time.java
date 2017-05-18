package br.com.reidapelada.model;

import java.util.ArrayList;

/**
 * Created by faria on 14/05/2017.
 */

public class Time {

    private ArrayList<Jogador> jogadoresTime;
    private int quantidadeJogadores;

    public Time(){
        this.jogadoresTime = new ArrayList<Jogador>();
    }

    public Time(int quantidadeJogadores){
        this.jogadoresTime = new ArrayList<Jogador>();
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public Time(ArrayList<Jogador> jogadoresTime, int quantidadeJogadores){
        this.jogadoresTime = jogadoresTime;
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public ArrayList<Jogador> getJogadoresTime(){
        return this.jogadoresTime;
    }

    public int getQuantidadeAtualJogadoresTime(){
        return this.jogadoresTime.size();
    }

    protected boolean inserindoJogadorTime(Jogador jogador){
        if((this.jogadoresTime.contains(jogador))||(this.jogadoresTime.size() == quantidadeJogadores))
            return false;
        this.jogadoresTime.add(jogador);
        return true;
    }
}
