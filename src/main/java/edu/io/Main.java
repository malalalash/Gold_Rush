package edu.io;

public class Main {
    public static void main(String[] args) {
        Token token1 = new Token("\u30FB");
        Token token2 = new Token("\uD83D\uDCB0");
        Token token3 = new Token("\uC6C3");

        System.out.println(token1.getLabel());
        System.out.println(token2.getLabel());
        System.out.println(token3.getLabel());

        Board board = new Board(5);
board.display();

    }
}