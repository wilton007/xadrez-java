package application;

import xadrez.PecaXadrez;

public class UI {
    public static void printTabuleiro(PecaXadrez[][] pecas){
        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i)+" ");
            for (int j = 0; j < pecas.length; j++) {
                printPecas(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    private static void printPecas(PecaXadrez pecaXadrez){
        if (pecaXadrez == null){
            System.out.print("-");
        }else {
            System.out.print(pecaXadrez);
        }
        System.out.print(" ");
    }
}
