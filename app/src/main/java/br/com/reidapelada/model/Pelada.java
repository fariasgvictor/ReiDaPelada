package br.com.reidapelada.model;

import java.util.ArrayList;

/**
 * Created by faria on 17/05/2017.
 */

public class Pelada {
    ArrayList<Jogador> jogadoresPelada = new ArrayList<Jogador>();
    ArrayList<Time> timesPelada = new ArrayList<Time>();

    Pelada(){
        this.jogadoresPelada = new ArrayList<Jogador>();
        this.timesPelada = new ArrayList<Time>();
    }

    Pelada(ArrayList<Jogador> jogadoresPelada){
        this.jogadoresPelada = jogadoresPelada;
    }

    private static int sortearNumeroDoIntervalo(int min, int max) {
        return ((int)(java.lang.Math.random()*(max - min + 1)))+ min;
    }

    protected ArrayList<Time> sorteiaJogadoresTimes(int quantidadeJogadoresTime){
        ArrayList<Time> times = new ArrayList<Time>();
        ArrayList<Jogador> jogadoresAuxiliar = new ArrayList<Jogador>();
        jogadoresAuxiliar = this.jogadoresPelada;
        int quantidadeTimes = this.determinaQuantidadeTimes(quantidadeJogadoresTime);
        for(int i = 0; i < quantidadeTimes; i++){
            Time time = new Time(quantidadeJogadoresTime);
            for(int j = 0; ((j < quantidadeJogadoresTime) && (!jogadoresAuxiliar.isEmpty())); j++){
                int jogadorSorteado = sortearNumeroDoIntervalo(0, jogadoresAuxiliar.size());
                time.inserindoJogadorTime(jogadoresAuxiliar.get(jogadorSorteado));
                jogadoresAuxiliar.remove(jogadorSorteado);
            }
            times.add(time);
        }
        return times;
    }

    protected int determinaQuantidadeTimes(int quantidadeJogadoresTime){
        int quantidadeTimes = this.jogadoresPelada.size() / quantidadeJogadoresTime;
        if((this.jogadoresPelada.size()%quantidadeJogadoresTime)>0)
            quantidadeTimes=+1;

        return quantidadeTimes;
    }
}
