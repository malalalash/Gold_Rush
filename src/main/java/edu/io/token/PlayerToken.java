package edu.io.token;

import edu.io.Board;

public class PlayerToken extends Token{
    public enum Move { NONE, LEFT, RIGHT, UP, DOWN }

    private final Board board;
    private int col;
    private int row;

    public PlayerToken(Board board, int col, int row) {
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        this.col = col;
        this.row = row;
    }
}
