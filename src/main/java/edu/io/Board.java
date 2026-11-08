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

        clean();
    }

    private void clean() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Token("\u30FB");
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getLabel() + " ");
            }
            System.out.println();
        }
    }

    public void placeToken(int col, int row, Token token) {
        board[col][row] = token;
    }

    public Token peekToken(int col, int row) {
        return board[col][row];
    }
}
