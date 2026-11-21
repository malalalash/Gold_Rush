package edu.io.token;

import edu.io.Board;

public class PlayerToken extends Token {
    public enum Move {NONE, LEFT, RIGHT, UP, DOWN}

    private final Board board;
    private int col;
    private int row;

    public PlayerToken(Board board) {
        this(board, 0, 0);
    }

    public PlayerToken(Board board, int col, int row) {
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        this.col = col;
        this.row = row;
        board.placeToken(col, row, this);
    }

    public Board.Coords pos() {
        return new Board.Coords(col, row);
    }

    public void move(Move direction) {
        if (direction == null || direction == Move.NONE) {
            return;
        }

        int targetCol = col;
        int targetRow = row;

        switch (direction) {
            case LEFT -> targetCol--;
            case RIGHT -> targetCol++;
            case UP -> targetRow--;
            case DOWN -> targetRow++;
        }

        if (targetCol < 0 || targetCol >= board.size() || targetRow < 0 || targetRow >= board.size()) {
            throw new IllegalArgumentException("Move out of bounds");
        }

        board.placeToken(col, row, new EmptyToken());
        col = targetCol;
        row = targetRow;
        board.placeToken(col, row, this);
    }
}
