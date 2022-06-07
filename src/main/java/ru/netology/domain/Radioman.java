package ru.netology.domain;

public class Radioman {
    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    private int enterStationUp;
    private int enterStationDown;
    private int enterVolumeUp;
    private int enterVolumeDown;

    private int switchingData = 5;


    //Звук.
    public void setVolumeUp(int enterVolumeUp) {
        this.enterVolumeUp = enterVolumeUp;
        upVolume(enterVolumeUp);
    }

    public void setVolumeDown(int enterVolumeDown) {
        this.enterVolumeDown = enterVolumeDown;
        downVolume(enterVolumeDown);
    }

    //Звук больше.
    public void upVolume(int enterVolumeUp) {
        this.enterVolumeUp = enterVolumeUp;
        if (enterVolumeUp <= maxStation && enterVolumeUp >= minVolume) {
            return;
        } else this.enterVolumeUp = maxVolume;
    }

    public int getUpVolum() {

        return enterVolumeUp;
    }

    //Звук меньше.
    public void downVolume(int enterVolumeDown) {
        this.enterVolumeDown = enterVolumeDown;
        if (enterVolumeDown <= maxVolume && enterVolumeDown >= minVolume) {
            return;

        } else this.enterVolumeDown = minVolume;
    }

    public int getDownVolume() {
        return enterVolumeDown;
    }

    //Радиостанция.
    public void setStationNext(int enterStationUp) {
        this.enterStationUp = enterStationUp;
        next(enterStationUp);
    }

    public void setStationPrev(int enterStationDown) {
        this.enterStationDown = enterStationDown;
        prev(enterStationDown);
    }

    //Станция вперед.
    public void upStation(int enterStationUp) {
        this.enterStationUp = enterStationUp;
        if (enterStationUp <= maxStation && enterStationUp >= minStation) {
            return;

        } else this.enterStationUp = 0;
        return;
    }

    public int getUpStation() {
        return enterStationUp;
    }

    //Станция назад.
    public void downStation(int enterStationDown) {
        this.enterStationDown = enterStationDown;
        if (enterStationDown <= maxStation && enterStationDown >= minStation) {
            return;

        } else this.enterStationDown = 9;
        return;
    }

    public int getDownStation() {
        return enterStationDown;
    }

    //Ввод значения пользователем - радиостанция.
    public void setSwitchingData(int switchingData) {
        this.switchingData = switchingData;
        if (switchingData <= maxStation & switchingData >= minStation) {
            return;
        }
        this.switchingData = 0;
    }

    public int getSwitchingData() {
        return switchingData;
    }

    //Кнопка Next.
    public void next(int enterStationUp) {
        this.enterStationUp = enterStationUp;
        enterStationUp++;
        upStation(enterStationUp);
    }

    //Кнопка Prev.
    public void prev(int enterStationDown) {
        this.enterStationDown = enterStationDown;
        enterStationDown--;
        downStation(enterStationDown);
    }

}
