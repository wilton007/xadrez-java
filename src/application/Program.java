package application;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {
    public static void main(String[] args) {
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printTabuleiro(partidaXadrez.getPecas());
    }
}
