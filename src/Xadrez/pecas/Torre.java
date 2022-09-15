package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.Pecas_xadrez;
import tabuleiro_jogo.Tabuleiro;

public class Torre extends Pecas_xadrez {
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "♜";
    }
}
