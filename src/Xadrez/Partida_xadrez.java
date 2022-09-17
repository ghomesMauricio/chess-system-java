package Xadrez;

import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
import tabuleiro_jogo.Posicao;
import tabuleiro_jogo.Tabuleiro;

public class Partida_xadrez {
    private Tabuleiro tabuleiro;

    public Partida_xadrez(){
        tabuleiro = new Tabuleiro(8,8);
        IniciandoPartida();
    }
    public Pecas_xadrez[][] pecas(){
        Pecas_xadrez[][] mat = new Pecas_xadrez[tabuleiro.getFileiras()][tabuleiro.getColunas()];
        for(int F = 0; F <tabuleiro.getColunas(); F++){
            for (int C = 0; C < tabuleiro.getFileiras(); C++)
                mat[F][C] = (Pecas_xadrez) tabuleiro.peca(F,C);
        }
        return mat;
    }
    private void IniciandoPartida(){
        tabuleiro.Espaco_peca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,0));
        tabuleiro.Espaco_peca(new Torre(tabuleiro,Cor.BRANCO),new Posicao(0,0));
        tabuleiro.Espaco_peca(new Rei(tabuleiro,Cor.PRETO),new Posicao(0,4));
    }

}