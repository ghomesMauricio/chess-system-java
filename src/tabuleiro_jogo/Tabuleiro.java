package tabuleiro_jogo;

public class Tabuleiro {
    private int coluna;
    private int fileira;
    private Peca [][] peca;

    public Tabuleiro(int coluna, int fileira){
        this.coluna = coluna;
        this.fileira = fileira;
        peca = new Peca[fileira][coluna];
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
        return peca[fileira][coluna];
    }
}
