package edu.io.token;

public abstract class Token {
    private final String label;

    public Token(String label) {
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("label cannot be empty");
        }
        this.label = label;
    }

    public String label() {
        return label;
    }
}
