package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //Переключение каналов Радиостанции.
    @Test
    void testMinimumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();
        String expectedStringNext = "next";
        String expectedStringPrev = "prev";

        radioman.setRadiostationNext("next");
        radioman.radiostationNextCalculate();

        radioman.setRadiostationPrev("prev");
        radioman.radiostationPrevCalculate();

        radioman.setEnterStation(1);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 1;

        assertEquals(expected, actual);
        assertEquals(expectedStringNext, radioman.getRadiostationNext());
        assertEquals(expectedStringPrev, radioman.getRadiostationPrev());
    }

    @Test
    void testMaximumCheckYourRadioStationNumber() {
        Radio radioman = new Radio();
        String expectedStringNext = "next";
        String expectedStringPrev = "prev";

        radioman.setRadiostationNext("next");
        radioman.radiostationNextCalculate();

        radioman.setRadiostationPrev("prev");
        radioman.radiostationPrevCalculate();

        radioman.setEnterStation(9);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expectedStringNext, radioman.getRadiostationNext());
        assertEquals(expectedStringPrev, radioman.getRadiostationPrev());
    }

    @Test
    void testMiddleCheckYourRadioStationNumber() {
        Radio radioman = new Radio();
        String expectedStringNext = "next";
        String expectedStringPrev = "prev";

        radioman.setRadiostationNext("next");
        radioman.radiostationNextCalculate();

        radioman.setRadiostationPrev("prev");
        radioman.radiostationPrevCalculate();

        radioman.setEnterStation(5);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 5;

        assertEquals(expected, actual);
        assertEquals(expectedStringNext, radioman.getRadiostationNext());
        assertEquals(expectedStringPrev, radioman.getRadiostationPrev());
    }

    @Test
    void testMinimumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();
        String expectedStringNext = "next";
        String expectedStringPrev = "prev";

        radioman.setRadiostationNext("next");
        radioman.radiostationNextCalculate();

        radioman.setRadiostationPrev("prev");
        radioman.radiostationPrevCalculate();

        radioman.setEnterStation(-1);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expectedStringNext, radioman.getRadiostationNext());
        assertEquals(expectedStringPrev, radioman.getRadiostationPrev());
    }

    @Test
    void testMaximumBorderCheckYourRadioStationNumber() {
        Radio radioman = new Radio();

        String expectedStringNext = "next";
        String expectedStringPrev = "prev";

        radioman.setRadiostationNext("next");
        radioman.radiostationNextCalculate();

        radioman.setRadiostationPrev("prev");
        radioman.radiostationPrevCalculate();

        radioman.setEnterStation(11);
        radioman.checkYourRadioStationNumber();

        int actual = radioman.getEnterStation();
        int expected = 0;

        assertEquals(expected, actual);
        assertEquals(expectedStringNext, radioman.getRadiostationNext());
        assertEquals(expectedStringPrev, radioman.getRadiostationPrev());
    }


    // Уровень увеличения громкости звука.(Up)
    @Test
    void testMinimumTurnUpTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "+";


        radioman.setNextVolumeUpCalculate("+");
        radioman.nextVolumUpCalculate();

        radioman.setCheckVolume(1);
        radioman.checkYourVolumeUpNumber();


        int actual = radioman.getCheckVolume();
        int expected = 2;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeUpCalculate());
    }

    @Test
    void testMaximumTurnUpTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "+";

        radioman.setNextVolumeUpCalculate("+");
        radioman.nextVolumUpCalculate();

        radioman.setCheckVolume(8);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeUpCalculate());
    }

    @Test
    void testMiddleTurnUpTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "+";

        radioman.setNextVolumeUpCalculate("+");
        radioman.nextVolumUpCalculate();

        radioman.setCheckVolume(5);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 6;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeUpCalculate());
    }

    @Test
    void testMinimumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "+";

        radioman.setNextVolumeUpCalculate("+");
        radioman.nextVolumUpCalculate();

        radioman.setCheckVolume(-2);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 0;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeUpCalculate());
    }

    @Test
    void testMaximumBorderTurnUpTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "+";

        radioman.setNextVolumeUpCalculate("+");
        radioman.nextVolumUpCalculate();

        radioman.setCheckVolume(11);
        radioman.checkYourVolumeUpNumber();

        int actual = radioman.getCheckVolume();
        int expected = 10;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeUpCalculate());
    }


    // Уровень уменьшения громкости звука.(Down)
    @Test
    void testMinimumTurnDownTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "-";

        radioman.setNextVolumeDownCalculate("-");
        radioman.nextVolumeDownCalculate();

        radioman.setCheckVolume(2);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 1;
        assertEquals(expectedString, radioman.getNextVolumeDownCalculate());


        assertEquals(expected, actual);
    }

    @Test
    void testMaximumTurnDownTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "-";

        radioman.setNextVolumeDownCalculate("-");
        radioman.nextVolumeDownCalculate();

        radioman.setCheckVolume(10);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeDownCalculate());
    }

    @Test
    void testMiddleTurnDownTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "-";

        radioman.setNextVolumeDownCalculate("-");
        radioman.nextVolumeDownCalculate();

        radioman.setCheckVolume(6);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 5;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeDownCalculate());
    }

    @Test
    void testMinimumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "-";

        radioman.setNextVolumeDownCalculate("-");
        radioman.nextVolumeDownCalculate();

        radioman.setCheckVolume(-3);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 0;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeDownCalculate());
    }

    @Test
    void testMaximumBorderTurnDownTheVolume() {
        Radio radioman = new Radio();
        String expectedString = "-";

        radioman.setNextVolumeDownCalculate("-");
        radioman.nextVolumeDownCalculate();

        radioman.setCheckVolume(12);
        radioman.checkYourVolumeDownNumber();

        int actual = radioman.getCheckVolume();
        int expected = 10;

        assertEquals(expected, actual);
        assertEquals(expectedString, radioman.getNextVolumeDownCalculate());
    }


    //Отрицательные тесты на изменения звука и переключение станций через +, -, next и prev.
    @Test
    void testElseRadiostationNextCalculate() {
        Radio radioman = new Radio();
        String expectedStringElse = "go";

        radioman.setRadiostationNext("go");
        radioman.radiostationNextCalculate();

        assertEquals(expectedStringElse, radioman.getRadiostationNext());
    }

    @Test
    void testElseRadiostationPrevCalculate() {
        Radio radioman = new Radio();
        String expectedStringElse = "stop";

        radioman.setRadiostationPrev("stop");
        radioman.radiostationPrevCalculate();

        assertEquals(expectedStringElse, radioman.getRadiostationPrev());
    }

    @Test
    void testElseNextVolumUpCalculate() {
        Radio radioman = new Radio();
        String expectedStringElse = "@_@";

        radioman.setNextVolumeUpCalculate("@_@");
        radioman.nextVolumUpCalculate();

        assertEquals(expectedStringElse, radioman.getNextVolumeUpCalculate());
    }

    @Test
    void testElseNextVolumeDownCalculate() {
        Radio radioman = new Radio();
        String expectedStringElse = ">^.^<";

        radioman.setNextVolumeDownCalculate(">^.^<");
        radioman.nextVolumeDownCalculate();

        assertEquals(expectedStringElse, radioman.getNextVolumeDownCalculate());
    }

}



