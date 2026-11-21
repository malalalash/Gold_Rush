package edu.io.tokens;

public class Token {
    private final String label;

    public Token(String label) {
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("label cannot be empty");
        }
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
