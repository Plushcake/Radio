package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //Переключение каналов Радиостанции.
    @Test
    void testMinimumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setEnterStation(1);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setEnterStation(9);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void testMiddleCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setEnterStation(5);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    void testMinimumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setEnterStation(-1);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        radioman.setEnterStation(11);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 0;

        assertEquals(expected, actual);

    }


    // Уровень увеличения громкости звука.(Up)
    @Test
    void testMinimumTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(1);
        radioman.checkYourVolumeUpNumber();


        int actual = radioman.getCheckVolume();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(8);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void testMiddleTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(5);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    void testMinimumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(-2);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(11);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }


    // Уровень уменьшения громкости звука.(Down)
    @Test
    void testMinimumTurnDownTheVolume() {
        Radio radioman = new Radio();


        radioman.setCheckVolume(2);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(10);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    void testMiddleTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(6);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    void testMinimumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(-3);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void testMaximumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();

        radioman.setCheckVolume(12);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    //Прямое указание номера для радиостанции.
    @Test
    void testStationSwitchings() {
        Radio radioman = new Radio();

        radioman.radioStationSwitching();
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = radioman.getEnterStation();

        assertEquals(expected, actual);
    }

}



