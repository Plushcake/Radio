package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // Уровень громкости звука.
    @Test
    public void testTurnUpTheVolume() {
        Radio radioman = new Radio();

       int volumeDataUp = 11;
       int expected = 6;
       int actual = radioman.turnUpTheVolume(volumeDataUp);

       assertEquals(expected, actual);
    }

    @Test
    void testTurnDownTheVolume() {
        Radio radioman = new Radio();

        int volumeDataDown = 0;
        int expected = 7;
        int actual = radioman.turnDownTheVolume(volumeDataDown);

        assertEquals(expected, actual);
    }

    @Test
    void testNextStation() {
        Radio radioman = new Radio();

        int stationData = 3;
        int expected = 3;
        int actual = radioman.nextStation(stationData);

        assertEquals(expected, actual);
    }

    //Переключение радио станции.

}