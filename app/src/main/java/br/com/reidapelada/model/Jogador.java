package br.com.reidapelada.model;

/**
 * Created by faria on 14/05/2017.
 */

public class Jogador {

    private int idJogador;
    private String nomeJogador;
    private String pePreferidoJogador; //Destro, Canhoto, Ambos
    private String posicaoJogador; //Goleiro, Lateral, Zagueiro, Ala, Volante, Meia, Atacante, Pivô

    public Jogador(){
        this.idJogador = 0;
        this.nomeJogador = "";
        this.posicaoJogador = "";
        this.pePreferidoJogador = "";
    }

    public Jogador(int idJogador, String nomeJogador, String posicaoJogador, String pePreferidoJogador){
        this.idJogador = idJogador;
        this.nomeJogador = nomeJogador;
        this.posicaoJogador = posicaoJogador;
        this.pePreferidoJogador = pePreferidoJogador;
    }

    public String getNomeJogador(){
        return this.nomeJogador;
    }

    public String getPePreferidoJogador(){
        return this.pePreferidoJogador;
    }

    public String getPosicao(){
        return this.posicaoJogador;
    }

    protected boolean trocaPosicao(String novaPosicao){
        if(this.posicaoJogador.equals(novaPosicao))
            return false;
        this.posicaoJogador = novaPosicao;
        return true;
    }
}
