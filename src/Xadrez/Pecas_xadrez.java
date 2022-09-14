package Xadrez;

import tabuleiro_jogo.Peca;
import tabuleiro_jogo.Tabuleiro;

public class Pecas_xadrez extends Peca {
    private Cor cor;

    public Pecas_xadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
