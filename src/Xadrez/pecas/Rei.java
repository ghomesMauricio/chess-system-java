package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.Pecas_xadrez;
import tabuleiro_jogo.Tabuleiro;

public class Rei extends Pecas_xadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return ("\uD83D\uDC51");
    }
}
