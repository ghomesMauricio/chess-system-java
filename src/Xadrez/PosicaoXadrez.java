package Xadrez;

import tabuleiro_jogo.MSG_aviso;
import tabuleiro_jogo.Posicao;

public class PosicaoXadrez {
    private char coluna;
    private int fileira;

    public PosicaoXadrez(char coluna, int fileira){
        if (coluna < 'a' || coluna > 'h' || fileira < 1 || fileira > 8  ) {
            throw new MSG_aviso("ERRO colocando de identificação de posição. Valido de A1 até H8.");
        }
        this.coluna = coluna;
        this.fileira = fileira;
    }

    public int getFileira() {
        return fileira;
    }

    public char getColuna() {
        return coluna;
    }
    protected Posicao toPosition(){
        return new Posicao( 8 - fileira, coluna - 'a');
    }
    protected static  PosicaoXadrez dePosicao(Posicao posicao){
        return  new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getFileira());
    }
    public String toString(){
        return ""+ coluna + fileira;
    }

}
