package edu.io;

import edu.io.token.EmptyToken;
import edu.io.token.Token;

import java.util.Random;

public class Board {
    public record Coords(int col, int row) {
    }

    private final Token[][] board;
    private static final int DEFAULT_SIZE = 8;
    public final int size;
    private final Random random = new Random();

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

    public int size() { return size; }

    public void clean() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = new EmptyToken() {
                };
            }
        }
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col].label() + " ");
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

    public Coords placeForPlayer() {
        return new Coords(0,0);
    };
}
