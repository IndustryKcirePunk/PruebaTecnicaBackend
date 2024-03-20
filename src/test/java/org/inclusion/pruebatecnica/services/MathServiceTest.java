package org.inclusion.pruebatecnica.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathServiceTest {

    private final MathServices service = new MathServices();

    @Test
    public void findMaximumNumberTest2() {
        int x = 7;
        int y = 5;
        int z = 12345;
        int expected = 12339;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest3() {
        int x = 5;
        int y = 0;
        int z = 4;
        int expected = 0;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest4() {
        int x = 10;
        int y = 5;
        int z = 15;
        int expected = 15;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest5() {
        int x = 17;
        int y = 8;
        int z = 54321;
        int expected = 54306;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest6() {
        int x = 499999993;
        int y = 9;
        int z = 1000000000;
        int expected = 999999995;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest7() {
        int x = 10;
        int y = 5;
        int z = 187;
        int expected = 185;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

    @Test
    public void findMaximumNumberTest8() {
        int x = 2;
        int y = 0;
        int z = 999999999;
        int expected = 999999998;
        var result = service.findMaximumNumber(x, y, z);

        assertEquals(expected, result);
    }

}
