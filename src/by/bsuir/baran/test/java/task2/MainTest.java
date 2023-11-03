package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {
    @Test
    public void testPointInsideFigure(){
        int x = 1;
        int y = 2;
        assertTrue(checkFigure(x, y));
    }

    @Test
    public void testPointOutsideFigure(){
        int x = 3;
        int y = 6;
        assertFalse(checkFigure(x, y));
    }

    @Test
    public void testPointOnBorderFigure(){
        int x = -4;
        int y = 2;
        assertTrue(checkFigure(x, y));
    }
}