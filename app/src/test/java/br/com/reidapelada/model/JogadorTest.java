package br.com.reidapelada.model;

/**
 * Created by faria on 14/05/2017.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class JogadorTest {

    @Test
    public void testaJogadorTrocaPosicaoGoleiro(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Goleiro"));

        assertEquals("Goleiro", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoLateral(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Lateral"));

        assertEquals("Lateral", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoZagueiro(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Zagueiro"));

        assertEquals("Zagueiro", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoAla(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Ala"));

        assertEquals("Ala", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoVolante(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Volante"));

        assertEquals("Volante", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoMeia(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Meia"));

        assertEquals("Meia", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoAtacante(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Atacante"));

        assertEquals("Atacante", jogador.getPosicao());
    }

    @Test
    public void testaJogadorTrocaPosicaoPivo(){
        Jogador jogador = new Jogador();
        assertEquals("", jogador.getPosicao());

        assertTrue(jogador.trocaPosicao("Pivô"));

        assertEquals("Pivô", jogador.getPosicao());
    }
}
