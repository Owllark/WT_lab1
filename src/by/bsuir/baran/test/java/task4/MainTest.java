package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
   // private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testNonePrimeNumbers(){
        int[] arr = {22, 25, 100, 1};
        int[] expected = {};
        assertArrayEquals(expected, findPrimeElementsIndexes(arr));
    }
    @Test
    public void testAllPrimeNumbers(){
        int[] arr = {19, 7, 31, 17};
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, findPrimeElementsIndexes(arr));
    }
    @Test
    public void testSomePrimeNumbers(){
        int[] arr = {8, 2, 7, 21};
        int[] expected = {1, 2};
        assertArrayEquals(expected, findPrimeElementsIndexes(arr));
    }

    @Test
    public void testIsPrimeFunction() {
        assertTrue(isPrime(7));
        assertTrue(isPrime(11));
        assertTrue(isPrime(31));
        assertFalse(isPrime(27));
        assertFalse(isPrime(1));
    }
}