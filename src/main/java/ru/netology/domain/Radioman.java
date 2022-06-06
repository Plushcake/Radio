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
    public void setVolumeDateUp(int enterVolumeUp) {
        this.enterVolumeUp = enterVolumeUp;
    }

    public void setVolumeDateDown(int enterVolumeDown) {
        this.enterVolumeDown = enterVolumeDown;
    }

    public int getVolumeDateUp() {
        return enterVolumeUp;
    }

    public int getVolumeDateDown() {
        return enterVolumeDown;
    }

    //Звук больше.
    public void upVolume() {
        if (enterVolumeUp <= maxStation);

        if (enterVolumeUp >= maxVolume) {
            enterVolumeUp = maxVolume;
        }
    }

    //Звук меньше.
    public void downVolume() {
        if (enterVolumeDown <= maxVolume) {

        }if (enterVolumeDown < minVolume) {
            enterVolumeDown = minVolume;
        }

    }

    //Радиостанция.
    public void setDataStantionUp(int enterStationUp) {
        this.enterStationUp = enterStationUp;
    }

    public void setDataStantionDown(int enterStationDown) {
        this.enterStationDown = enterStationDown;
    }

    public int getDataStantionUp() {
        return enterStationUp;
    }

    public int getDataStantionDown() {
        return enterStationDown;
    }

    //Станция вперед.
    public void upStation() {
        if (enterStationUp <= maxStation) {
            enterStationUp = enterStationUp + 1;
        }
        if (enterStationUp >= 10) {
            enterStationUp = minStation;
        }
    }

    //Станция назад.
    public void downStation() {
        if (enterStationDown <= maxStation) {
            enterStationDown = enterStationDown - 1;
        }
        if (enterStationDown <= -1 | enterStationDown > 10) {
            enterStationDown = maxStation;
        }
    }

    //Ввод значения пользователем - радиостанция.
    public void setSwitchingData(int switchingData) {
        this.switchingData = switchingData;
        if (switchingData <= maxStation & switchingData >= minStation) {
        }
        switchingData = minStation;
    }

    public int getSwitchingData() {
        return switchingData;
    }

    //Кнопка Next.
    public void next() {
        setDataStantionUp(enterStationUp);
    }

    //Кнопка Prev.
    public void prev() {
        setDataStantionDown(enterStationDown);
    }

}
