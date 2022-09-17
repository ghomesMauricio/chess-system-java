package tabuleiro_jogo;

public class MSG_aviso extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public MSG_aviso(String msg){
        super(msg);
    }
}
