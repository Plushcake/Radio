package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    @Test
    void test1Station() {
        Radioman radio = new Radioman();

        radio.setStationСalculation(-11);
        radio.station();

        int actual = radio.getStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test2Station() {
        Radioman radio = new Radioman();

        radio.setStationСalculation(12);
        radio.station();

        int actual = radio.getStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3Station() {
        Radioman radio = new Radioman();

        radio.setStationСalculation(5);
        radio.station();

        int actual = radio.getStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test1VolumeUp() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(5);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    void test2VolumeUp() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(11);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    void test3VolumeUp() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(-2);
        radio.volumeUp();

        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void test1VolumeDown() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(5);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    void test2VolumeDown() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(-1);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void test3VolumeDown() {
        Radioman radio = new Radioman();

        radio.setVolumeСalculation(12);
        radio.volumeDown();

        int actual = radio.getVolume();
        int expected = 10;
        assertEquals(actual, expected);
    }
}


//Звук.
  /*  @Test
    void test1UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(14);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(0);

        int actual = radio.getUpVolum();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(11);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(9);

        int actual = radio.getUpVolum();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test5UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(3);

        int actual = radio.getUpVolum();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void test6UpVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeUp(-10);

        int actual = radio.getUpVolum();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDown(0);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDown(-2);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDown(5);

        int actual = radio.getDownVolume();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownVolume() {
        Radioman radio = new Radioman();

        radio.setVolumeDown(11);

        int actual = radio.getDownVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    //Радиостанция.
    @Test
    void test1UpStation() {
        Radioman radio = new Radioman();

        radio.setStationNext(11);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test2UpStation() {
        Radioman radio = new Radioman();

        radio.setStationNext(5);

        int actual = radio.getUpStation();
        int expected = 6;

        assertEquals(actual, expected);
    }

    @Test
    void test3UpStation() {
        Radioman radio = new Radioman();

        radio.setStationNext(10);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test4UpStation() {
        Radioman radio = new Radioman();

        radio.setStationNext(-1);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test5UpStation() {
        Radioman radio = new Radioman();

        radio.setStationNext(-4);

        int actual = radio.getUpStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void test1DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(5);

        int actual = radio.getDownStation();
        int expected = 4;

        assertEquals(actual, expected);
    }

    @Test
    void test2DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(6);

        int actual = radio.getDownStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void test3DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(0);

        int actual = radio.getDownStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test4DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(-3);

        int actual = radio.getDownStation();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void test5DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(4);

        int actual = radio.getDownStation();
        int expected = 3;

        assertEquals(actual, expected);
    }

    @Test
    void test6DownStation() {
        Radioman radio = new Radioman();

        radio.setStationPrev(11);

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

   */

