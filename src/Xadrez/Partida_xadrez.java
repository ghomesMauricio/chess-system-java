package Xadrez;

import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
import tabuleiro_jogo.Posicao;
import tabuleiro_jogo.Tabuleiro;

public class Partida_xadrez {
    private Tabuleiro tabuleiro;

    public Partida_xadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        IniciandoPartida();
    }

    public Pecas_xadrez[][] pecas() {
        Pecas_xadrez[][] mat = new Pecas_xadrez[tabuleiro.getFileiras()][tabuleiro.getColunas()];
        for (int F = 0; F < tabuleiro.getColunas(); F++) {
            for (int C = 0; C < tabuleiro.getFileiras(); C++)
                mat[F][C] = (Pecas_xadrez) tabuleiro.peca(F, C);
        }
        return mat;
    }

    private void coordenadasXadrez(char coluna, int fileira, Pecas_xadrez peca) {
        tabuleiro.Espaco_peca(peca, new PosicaoXadrez(coluna, fileira).toPosition());
    }

    private void IniciandoPartida() {
        coordenadasXadrez('b', 6, new Torre(tabuleiro, Cor.BRANCO));
        coordenadasXadrez('a', 1, new Torre(tabuleiro, Cor.CIANO));

    }
}