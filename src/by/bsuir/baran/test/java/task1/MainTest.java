package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void testPositiveValue() {
        double x = 2.8;
        double y = 3.3;
        double expected = 3.0;
        double actual = calculateExpression(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }

    @Test
    public void testZeroValue() {
        double x = 0;
        double y = 0;
        double expected = 0.5;
        double actual = calculateExpression(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }
    @Test
    public void testNegativeValue() {
        double x = -5.5;
        double y = -2.7;
        double expected = -5.2;
        double actual = calculateExpression(x,y);
        double epsilon = 0.1;
        assertEquals(expected, actual, epsilon);
    }
}