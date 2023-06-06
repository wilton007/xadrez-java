package xadrez;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;
    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        iniciarPartida();
    }
    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    private void iniciarPartida(){
        tabuleiro.lugarPecas(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
        tabuleiro.lugarPecas(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
    }
}
