package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    //Звук.
    @Test
    void test1UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(14);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(0);

        int actual = radio.getUpVolum();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(11);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(9);

        int actual = radio.getUpVolum();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test5UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(3);

        int actual = radio.getUpVolum();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void test6UpVolume() {
        Radioman radio = new Radioman();

        radio.setUpVolume(-10);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownVolume() {
        Radioman radio = new Radioman();

        radio.setDownVolume(0);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownVolume() {
        Radioman radio = new Radioman();

        radio.setDownVolume(-2);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownVolume() {
        Radioman radio = new Radioman();

        radio.setDownVolume(5);

        int actual = radio.getDownVolume();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownVolume() {
        Radioman radio = new Radioman();

        radio.setDownVolume(11);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    //Радиостанция.
    @Test
    void test1UpStation() {
        Radioman radio = new Radioman();

        radio.setNext(11);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpStation() {
        Radioman radio = new Radioman();

        radio.setNext(5);

        int actual = radio.getUpStation();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpStation() {
        Radioman radio = new Radioman();

        radio.setNext(10);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpStation() {
        Radioman radio = new Radioman();

        radio.setNext(-1);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test5UpStation() {
        Radioman radio = new Radioman();

        radio.setNext(-4);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(5);

        int actual = radio.getDownStation();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(6);

        int actual = radio.getDownStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(0);

        int actual = radio.getDownStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(-3);

        int actual = radio.getDownStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test5DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(4);

        int actual = radio.getDownStation();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void test6DownStation() {
        Radioman radio = new Radioman();

        radio.setPrev(11);

        int actual = radio.getDownStation();
        int expected = 9;

        assertEquals(actual, expected);
    }


    //Данные введенные пользователем.
    @Test
    void test1SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(3);

        int actual = radio.getSwitchingData();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void test2SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(5);

        int actual = radio.getSwitchingData();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test3SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(12);

        int actual = radio.getSwitchingData();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test4SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(-8);

        int actual = radio.getSwitchingData();
        int expected = 0;

        assertEquals(actual, expected);
    }

}
