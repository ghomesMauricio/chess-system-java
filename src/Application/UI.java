package Application;

import Xadrez.Cor;
import Xadrez.Pecas_xadrez;

public class UI {
    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void printTabuleiro(Pecas_xadrez[][] Peca){
        for (int C = 0; C < Peca.length; C++){
            System.out.print((8 - C) + " ");
            for (int F = 0; F < Peca.length; F++){
                printPeca(Peca[C][F]);
            }
            System.out.println();
        }
        System.out.println( "  A B C D E F G H");
    }
        private static void printPeca(Pecas_xadrez Peca) {

        if (Peca == null) {
            System.out.print("-" + ANSI_RESET);
        }
        else {
            if (Peca.getCor() == Cor.BRANCO) {
                System.out.print(ANSI_WHITE + Peca + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_PURPLE + Peca + ANSI_RESET);
            }
        }
        System.out.print(" ");
    }

}

