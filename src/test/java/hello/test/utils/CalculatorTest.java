package hello.test.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void summaryTest() {

        int sum = cal.summary(1, 2, 3);
        assertThat(sum).isEqualTo(6);
    }

    @Test
    void summaryV2Test() {

        int sum = cal.summaryV2(1, 2, 3);
        assertThat(sum).isEqualTo(6);
    }

}