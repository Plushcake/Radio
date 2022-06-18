package ru.netology.domain;

public class Radioman {
    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    //private int enterStationUp;
    //private int enterStationDown;
    //private int enterVolumeUp;
    //private int enterVolumeDown;

    //private int switchingData = 5;

    private int enterStation;
    private int enterVolume;


    public void setStationСalculation(int enterStation) {
        this.enterStation = enterStation;
    }

    public void station() {
        if (enterStation <= 9 && enterStation >= 0) {
            setStationСalculation(enterStation);
            return;
        } else if (enterStation >= 10) {
            setStationСalculation(minStation);
            return;
        }
        setStationСalculation(maxStation);
        return;
    }


    public int getStation() {
        return enterStation;
    }

    public void setVolumeСalculation(int enterVolume) {
        this.enterVolume = enterVolume;
    }

    public void volumeUp() {
        enterVolume++;
        if (enterVolume <= 10 && enterVolume >= 0) {
            setVolumeСalculation(enterVolume);
            return;
        } else if (enterVolume >= 11) {
            setVolumeСalculation(maxVolume);
            return;
        }
        setVolumeСalculation(minVolume);
        return;
    }

    public void volumeDown() {
        enterVolume--;
        if (enterVolume <= 10 && enterVolume >= 0) {
            setVolumeСalculation(enterVolume);
            return;
        } else if (enterVolume <= -1) {
            setVolumeСalculation(minVolume);
            return;
        }
        setVolumeСalculation(maxVolume);
        return;
    }

    public int getVolume() {
        return enterVolume;
    }


    //Звук.
    /*public void setVolumeUp(int enterVolumeUp) {
        this.enterVolumeUp = enterVolumeUp;
        upVolume(enterVolumeUp);
    }

     public void setVolumeDown(int enterVolumeDown) {
        this.enterVolumeDown = enterVolumeDown;
        downVolume(enterVolumeDown);


    //Звук больше.
    public void upVolume(int enterStationUp) {
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
        return this.switchingData;
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

     */

}
