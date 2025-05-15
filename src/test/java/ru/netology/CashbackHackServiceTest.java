package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn200at800() {
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1at999() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999at1() {
        int expected = 999;
        int actual = service.remain(1);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0at1000() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999at1001() {
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }

}