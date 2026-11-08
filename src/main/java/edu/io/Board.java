package edu.io;

public class Board {
    private final Token[][] board;
    private final int size;

    public Board(int size) {

        if (size < 2) {
            throw new IllegalArgumentException("Proszę podać wymiar planszy większy niż 2!");
        }
        this.size = size;
        this.board = new Token[size][size];

        createBoard();
    }

    private void createBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Token("\u30FB");
            }
        }
    }

    public void drawBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getLabel() + " ");
            }
            System.out.println();
        }
    }
}
