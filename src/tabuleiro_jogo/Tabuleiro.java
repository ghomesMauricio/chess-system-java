package tabuleiro_jogo;

public class Tabuleiro {
    private int colunas;
    private int fileiras;
    private Peca [][] Pecas;

    public Tabuleiro(int coluna, int fileira){
        if (fileira < 1||coluna < 1){
            throw new MSG_aviso("ERRO CRIANDO TABULEIRO: é necessario ao menos 1 coluna e 1 fileira.");
        }
        this.colunas = coluna;
        this.fileiras = fileira;
        Pecas = new Peca[fileira][coluna];
    }
    public int getFileiras() {
        return fileiras;
    }
    public int getColunas() {
        return colunas;
    }
    public Peca peca (int fileira, int coluna){
        if (!posicaoExistente(fileira,coluna)){
            throw new MSG_aviso("não existe essa peça");
        }
        return Pecas[fileira][coluna];
    }

    public Peca peca (Posicao posicao){
        return peca(posicao.getFileira(),posicao.getColuna());
    }

    public void Espaco_peca(Peca peca, Posicao posicao){
        if (temUmaPeca(posicao)){
            throw new MSG_aviso("ja existe uma peca nessa " + posicao);
        }
        Pecas [posicao.getColuna()][posicao.getFileira()] = peca;
        peca.posicao = posicao;
    }
    // certificação que á uma peça //
    private boolean posicaoExistente(int fileira, int coluna){
        return fileira >= 0 && fileira< fileiras && coluna >= 0 && coluna < colunas ;
    }
    public boolean posicaoExistente(Posicao posicao){
        return  posicaoExistente(posicao.getFileira(),posicao.getColuna());
    }
    public boolean temUmaPeca(Posicao posicao){
        if (!posicaoExistente(posicao)){
            throw new MSG_aviso("Posição não existente.");
        }
        return peca(posicao) != null;
    }

}
