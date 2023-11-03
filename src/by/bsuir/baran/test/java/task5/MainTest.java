package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    public void testIfAllElements(){
        int[] arr = {18,11,9,3,1};
        assertEquals(4, findLeastNumberOfElements(arr));
    }
    @Test
    public void testIfZeroElements(){
        int[] arr = {12,33,39,40,55};
        assertEquals(0, findLeastNumberOfElements(arr));
    }
    @Test
    public void testIfSomeElements(){
        int[] arr = {8,3,5,10,6,1};
        assertEquals(3, findLeastNumberOfElements(arr));
    }

}