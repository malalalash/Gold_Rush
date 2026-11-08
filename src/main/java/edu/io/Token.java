package edu.io;

public class Token {
    private final String label;

    public Token(String label) {
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Etykieta żetonu nie może być pusta!");
        }
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
