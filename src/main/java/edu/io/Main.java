package edu.io;

import edu.io.token.Token;

public class Main {
    public static void main(String[] args) {


        Board board = new Board(5);
        board.display();

        Token tokenToPeek = board.peekToken(3, 1);

        System.out.println(tokenToPeek.label());
        board.display();
    }
}