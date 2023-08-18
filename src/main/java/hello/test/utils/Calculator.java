package hello.test.utils;

import java.util.Arrays;

public class Calculator {

    public int summary(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

    public int summaryV2(int... numbers) {
        int sum = 0;
        int length = numbers.length;

        for (int i = 1; i <= length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

}
