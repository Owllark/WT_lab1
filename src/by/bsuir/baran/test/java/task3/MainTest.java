package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void testEqualBoundaries(){
        double a = 0;
        double b = 0;
        double h = 0.5;
        double[][] expected = {{0, Math.tan(0)}};
        assertArrayEquals(expected, calculateTangentWithStep(a, b, h));
    }

    @Test
    public void testNormal(){
        double a = 0;
        double b = 1;
        double h = 0.5;
        double[][] expected = {{0, Math.tan(0)}, {0.5, Math.tan(0.5)}, {1, Math.tan(1)}};
        assertArrayEquals(expected, calculateTangentWithStep(a, b, h));
    }
}