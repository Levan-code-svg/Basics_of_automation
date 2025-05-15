package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn200at800() {
        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1at999() {
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999at1() {
        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0at1000() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999at1001() {
        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected, actual);
    }

}