package Application;

import Xadrez.Partida_xadrez;
import tabuleiro_jogo.Tabuleiro;

public class Program {
    public static void main(String[] args) {
        Partida_xadrez partida_xadrez = new Partida_xadrez();
        UI.printTabuleiro(partida_xadrez.pecas());
    }
}
