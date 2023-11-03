package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void checkEqualBoundaries(){
        double a = 0;
        double b = 0;
        double h = 0.5;
        double[][] expected = {{0, 0}};
        assertEquals(expected, calculateTangentWithStep(a,b,h));
    }

    @Test
    public void checkNormal(){
        double a = 0;
        double b = 1;
        double h = 0.5;
        double[][] expected = {{0, 0}, {Math.tan(0.5), 0.5}, {Math.tan(1), 1}};
        assertEquals(expected, calculateTangentWithStep(a, b, h));
    }
}