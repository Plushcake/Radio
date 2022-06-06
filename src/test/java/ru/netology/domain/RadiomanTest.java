package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    //Звук.
    @Test
    void test1UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateUp(14);
        radio.upVolume();

        int actual = radio.getVolumeDateUp();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateUp(0);
        radio.upVolume();

        int actual = radio.getVolumeDateUp();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateUp(11);
        radio.upVolume();

        int actual = radio.getVolumeDateUp();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateUp(9);
        radio.upVolume();

        int actual = radio.getVolumeDateUp();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateDown(0);
        radio.downVolume();

        int actual = radio.getVolumeDateDown();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateDown(-2);
        radio.downVolume();

        int actual = radio.getVolumeDateDown();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateDown(5);
        radio.downVolume();

        int actual = radio.getVolumeDateDown();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDateDown(11);
        radio.downVolume();

        int actual = radio.getVolumeDateDown();
        int expected = 11;

        assertEquals(actual, expected);
    }

    //Радиостанция.
    @Test
    void test1UpStation() {
        Radioman radio = new Radioman();

        radio.next();
        radio.setDataStantionUp(3);
        radio.upStation();

        int actual = radio.getDataStantionUp();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpStation() {
        Radioman radio = new Radioman();

        radio.next();
        radio.setDataStantionUp(8);
        radio.upStation();

        int actual = radio.getDataStantionUp();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpStation() {
        Radioman radio = new Radioman();

        radio.next();
        radio.setDataStantionUp(10);
        radio.upStation();

        int actual = radio.getDataStantionUp();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpStation() {
        Radioman radio = new Radioman();

        radio.next();
        radio.setDataStantionUp(7);
        radio.upStation();

        int actual = radio.getDataStantionUp();
        int expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(5);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(6);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(0);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(-3);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 9;

        assertEquals(actual, expected);
    }
    @Test
    void test5DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(4);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 3;

        assertEquals(actual, expected);
    }
    @Test
    void test6DownStation() {
        Radioman radio = new Radioman();

        radio.prev();
        radio.setDataStantionDown(11);
        radio.downStation();

        int actual = radio.getDataStantionDown();
        int expected = 9;

        assertEquals(actual, expected);
    }


    //Данные введенные пользователем.
    @Test
    void test1SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(3);

        int actual = radio.getSwitchingData();
        int expected = radio.getSwitchingData();

        assertEquals(actual, expected);
    }

    @Test
    void test2SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(0);

        int actual = radio.getSwitchingData();
        int expected = radio.getSwitchingData();

        assertEquals(actual, expected);
    }

    @Test
    void test3SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(12);

        int actual = radio.getSwitchingData();
        int expected = radio.getSwitchingData();

        assertEquals(actual, expected);
    }

    @Test
    void test4SwitchingData() {
        Radioman radio = new Radioman();

        radio.setSwitchingData(-8);

        int actual = radio.getSwitchingData();
        int expected = radio.getSwitchingData();

        assertEquals(actual, expected);
    }

}
