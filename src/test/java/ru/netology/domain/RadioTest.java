package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    // Уровень громкости звука.
    @Test
    void testTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnUpTheVolume(11);

        int actual = radioman.getTurnUpTheVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void testTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setTurnDownTheVolume(0);

        int actual = radioman.getTurnDownTheVolume();
        int expected = 3;


        assertEquals(expected, actual);
    }

    //Переключение радио станции.
    @Test
    void testNextAnsPrevStation() {
        Radio radioman = new Radio();

        radioman.setNextAnsPrevStation(2);

        int actual = radioman.getNextAnsPrevStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
}

