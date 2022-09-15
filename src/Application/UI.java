package Application;

import Xadrez.Pecas_xadrez;

public class UI {
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
    public static void printPeca(Pecas_xadrez Peca){
        if (Peca == null){
            System.out.print("-");
        }
        else {
            System.out.print(Peca);
        }
        System.out.print(" ");
    }

}

