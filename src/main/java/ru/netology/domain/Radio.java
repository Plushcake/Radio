package ru.netology.domain;

public class Radio {

    int maxVolume = 10;
    int maxStation = 9;
    int minVolume = 0;
    int minStation = 0;

    // Уровень громкости звука.
    public int turnUpTheVolume(int volumeUp) {
        if (volumeUp < maxVolume) {
            volumeUp = volumeUp + 1;
        }
        if (volumeUp > maxVolume) {
            volumeUp = maxVolume;
        }
        return volumeUp;
    }

    public  int turnDownTheVolume(int volumeDown){
        if (volumeDown < maxVolume) {
            volumeDown = volumeDown - 1;
        }
        if (volumeDown < minVolume) {
            volumeDown = minVolume;
        }
        return  volumeDown;
    }

    //Переключение радио станций.

    public  int nextStation(int nextStation) {
        if (nextStation > maxStation ) {
            nextStation = minStation;

        }
        if (nextStation < minStation ) {
            nextStation = maxStation;
        }
        return nextStation;
    }

}