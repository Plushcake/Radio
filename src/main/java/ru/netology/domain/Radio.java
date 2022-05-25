package ru.netology.domain;

public class Radio {

    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;
    private int volumeUp;
    private int volumeDown;
    private int nextStation;


    // Уровень громкости звука.
    public void setTurnUpTheVolume(int volumeUp) {
        if (volumeUp < maxVolume) {
            volumeUp = volumeUp + 1;
        }
        if (volumeUp > maxVolume) {
            volumeUp = maxVolume;
        }
        this.volumeUp = volumeUp;
    }

    public int getTurnUpTheVolume() {
        return volumeUp;
    }


    public void setTurnDownTheVolume(int volumeDown) {
        if (volumeDown < maxVolume) {
            volumeDown = volumeDown - 1;
        }
        if (volumeDown < minVolume) {
            return;
        }
        this.volumeDown = volumeDown;
    }

    public int getTurnDownTheVolume() {
        return volumeDown;
    }

    //Переключение радио станций.

    public void setNextAnsPrevStation(int nextStation) {
        if (nextStation > maxStation) {
            return;

        }
        if (nextStation < minStation) {
            nextStation = maxStation;
        }
        this.nextStation = nextStation;
    }

    public int getNextAnsPrevStation() {
        return nextStation;
    }


}