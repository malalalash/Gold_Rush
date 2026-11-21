package edu.io.token;

import edu.io.Board;

public class PlayerToken extends Token{
    private final Board board;
    private int col;
    private int row;

    public PlayerToken(Board board, int col, int row) {
        this.board = board;
        this.col = col;
        this.row = row;
    }
}
