package task8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void checkAllBefore(){
        double[] firstArray = {5, 6, 7, 8, 9};
        double[] secondArray = {1, 2, 3, 4};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }
    @Test
    public void checkAllAfter(){
        double[] firstArray = {1, 5, 9, 10, 11};
        double[] secondArray = {12, 15, 19, 21, 25};
        int[] expected = {4,4,4,4,4};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }
    @Test
    public void checkUsual(){
        double[] firstArray = {5, 6, 12, 15};
        double[] secondArray = {2, 5, 10, 13};
        int[] expected = {0,1,2,3};
        assertArrayEquals(expected, findIndexes(firstArray, secondArray));
    }

}