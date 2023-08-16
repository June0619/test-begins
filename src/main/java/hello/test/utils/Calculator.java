package hello.test.utils;

import java.util.Arrays;

public class Calculator {

    public int summary(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

}
