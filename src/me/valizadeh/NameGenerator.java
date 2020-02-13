package me.valizadeh;

import java.util.Random;

public class NameGenerator {

    public static final int LEFT_LIMIT = 97;// letter 'a'
    public static final int RIGHT_LIMIT = 122;// letter 'z'
    public static final int TARGET_STRING_LENGTH = 15;

    public static String generate() {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(TARGET_STRING_LENGTH);
        for (int i = 0; i < TARGET_STRING_LENGTH; i++) {
            int randomLimitedInt = LEFT_LIMIT + (int)
                    (random.nextFloat() * (RIGHT_LIMIT - LEFT_LIMIT + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
