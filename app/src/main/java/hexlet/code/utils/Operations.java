package hexlet.code.utils;

import java.util.Random;

public enum Operations {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*");

    private static final Operations[] VALUES = values();
    private static final Random RANDOM = new Random();
    private final String operation;

    Operations(String s) {
        operation = s;
    }

    public static Operations getRandomOperation() {
        return VALUES[RANDOM.nextInt(VALUES.length)];
    }

    public String getOperation() {
        return operation;
    }
}
