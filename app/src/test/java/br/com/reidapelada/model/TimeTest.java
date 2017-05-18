package br.com.reidapelada.model;

/**
 * Created by faria on 14/05/2017.
 */

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TimeTest {

    @Test
    public void testaInserindoJogadorTime(){
        Jogador jogador = new Jogador();
        ArrayList<Jogador> jogadoresTime = new ArrayList<Jogador>();
        Time time = new Time(jogadoresTime, 5);

        assertEquals(0, time.getQuantidadeAtualJogadoresTime());

        assertTrue(time.inserindoJogadorTime(jogador));

        assertEquals(1, time.getQuantidadeAtualJogadoresTime());
    }

    @Test
    public void testaInserindoMesmoJogadorTime(){
        Jogador jogador = new Jogador();
        ArrayList<Jogador> jogadoresTime = new ArrayList<Jogador>();
        Time time = new Time(jogadoresTime, 5);

        assertEquals(0, time.getQuantidadeAtualJogadoresTime());

        assertTrue(time.inserindoJogadorTime(jogador));

        assertEquals(1, time.getQuantidadeAtualJogadoresTime());

        assertFalse(time.inserindoJogadorTime(jogador));

        assertEquals(1, time.getQuantidadeAtualJogadoresTime());
    }

    @Test
    public void testaInserindoMaisJogadoresTimeQuePermitido(){
        Jogador jogador = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        ArrayList<Jogador> jogadoresTime = new ArrayList<Jogador>();
        Time time = new Time(jogadoresTime, 2);

        assertEquals(0, time.getQuantidadeAtualJogadoresTime());

        assertTrue(time.inserindoJogadorTime(jogador));

        assertEquals(1, time.getQuantidadeAtualJogadoresTime());

        assertTrue(time.inserindoJogadorTime(jogador2));

        assertEquals(2, time.getQuantidadeAtualJogadoresTime());

        assertFalse(time.inserindoJogadorTime(jogador3));

        assertEquals(2, time.getQuantidadeAtualJogadoresTime());
    }
}
