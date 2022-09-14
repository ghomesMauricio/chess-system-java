package board_game;

public class Position {
    private  int coluna;
    private  int fileira;

    public Position(int coluna, int fileira) {
        this.coluna = coluna;
        this.fileira = fileira;

    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    @Override
    public String toString() {
        return fileira + " , " + coluna;
    }
}
