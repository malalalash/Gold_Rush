package edu.io;

public class Board {
    private final Token[][] board;
    private static int DEFAULT_SIZE = 8;
    public final int size;

    public Board() {
        this(DEFAULT_SIZE);
    }

    public Board(int size) {

        if (size < 1) {
            throw new IllegalArgumentException("Proszę podać wymiar planszy większy niż 2!");
        }
        this.size = size;
        this.board = new Token[size][size];
        clean();
    }

    public void clean() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = new Token("\u30FB");
            }
        }
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col].getLabel() + " ");
            }
            System.out.println();
        }
    }


    public void placeToken(int col, int row, Token token) {
        board[row][col] = token;
    }

    public Token peekToken(int col, int row) {
        return board[row][col];
    }
}
