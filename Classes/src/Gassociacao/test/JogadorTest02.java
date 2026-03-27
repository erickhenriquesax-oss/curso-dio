package Gassociacao.test;


import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Erick");
        Time time1 = new Time("Brasil");

        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
