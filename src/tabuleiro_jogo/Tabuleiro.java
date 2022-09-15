package tabuleiro_jogo;

public class Tabuleiro {
    private int coluna;
    private int fileira;
    private Peca [][] Pecas;

    public Tabuleiro(int coluna, int fileira){
        this.coluna = coluna;
        this.fileira = fileira;
        Pecas = new Peca[fileira][coluna];
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Peca peca (int fileira, int coluna){
        return Pecas[fileira][coluna];
    }

    public void Espaco_peca(Peca peca, Posicao posicao){
        Pecas [posicao.getColuna()][posicao.getFileira()] = peca;
        peca.posicao = posicao;
    }
}
