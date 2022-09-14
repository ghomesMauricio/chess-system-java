package Xadrez;

import tabuleiro_jogo.Tabuleiro;

public class Partida_xadrez {
    private Tabuleiro tabuleiro;

    public Partida_xadrez(){
        tabuleiro = new Tabuleiro(8,8);
    }
    public Pecas_xadrez[][] pecas(){
        Pecas_xadrez[][] mat = new Pecas_xadrez[tabuleiro.getFileira()][tabuleiro.getColuna()];
        for(int F=0; F <tabuleiro.getFileira(); F++){
            for ( int C=0; C < tabuleiro.getColuna(); C++)
                mat[F][C] = (Pecas_xadrez) tabuleiro.peca(F,C);
        }
        return mat;
    }
}
