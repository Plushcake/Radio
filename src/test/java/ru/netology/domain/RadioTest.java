package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //Проверка доступности радиостанций.
    @Test
    void testMinimumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(1);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(9);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMiddleCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(5);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void testMinimumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(-1);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(11);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void test1CheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(27);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void test2CheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setCheckYourRadioStationNumber(3);

        int actual = radioman.getCheckYourRadioStationNumber();
        int expected = 3;

        assertEquals(expected, actual);
    }

    // Уровень увеличения громкости звука.
    @Test
    void testMinimumTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(1);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(8);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMiddleTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(5);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void testMinimumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(-2);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(11);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    // Уровень уменьшения громкости звука.
    @Test
    void testMinimumTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(2);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 1;


        assertEquals(expected, actual);
    }

    @Test
    void testMaximumTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(10);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMiddleTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(6);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void testMinimumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(-2);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(12);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }



    //Переключение радиостанции.
    @Test
    void testMinimumNextAndPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAndPrevStation(1);

        int actual = radioman.getNextAndPrevStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumNextAndPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAndPrevStation(9);

        int actual = radioman.getNextAndPrevStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMiddleNextAndPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAndPrevStation(5);

        int actual = radioman.getNextAndPrevStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void testMinimumBorderNextAndPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAndPrevStation(-2);

        int actual = radioman.getNextAndPrevStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void testMaximumBorderNextAndPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAndPrevStation(11);

        int actual = radioman.getNextAndPrevStation();
        int expected = 0;

        assertEquals(expected, actual);
    }


}

