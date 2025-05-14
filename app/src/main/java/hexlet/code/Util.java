package hexlet.code;

import java.util.Random;

public class Util {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int min, int max) {
        return RANDOM.nextInt(min, max);
    }
}
