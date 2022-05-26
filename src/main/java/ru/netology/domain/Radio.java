package ru.netology.domain;

public class Radio {

    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;
    private int volumeUp;
    private int volumeDown;
    private int nextStation;
    public int checkStation;

    //Проверка доступности радиостанций.
    public void setCheckYourRadioStationNumber(int checkStation) {

        if (checkStation <= maxStation & checkStation >= minStation) {
            this.checkStation = checkStation;
            setNextAndPrevStation(checkStation);
        }
        return;

    }

    public int getCheckYourRadioStationNumber() {
        return checkStation;
    }


    // Уровень громкости звука.
    public void setTurnUpTheVolume(int volumeUp) {

        if (volumeUp < maxVolume) {
            volumeUp = volumeUp + 1;
        }
        if (volumeUp >= maxVolume) {
            volumeUp = 10;
        } else if (volumeUp < 0) {
            volumeUp = 0;
        }
        this.volumeUp = volumeUp;
    }

    public int getTurnUpTheVolume() {
        return volumeUp;
    }


    public void setTurnDownTheVolume(int volumeDown) {

        if (volumeDown <= maxVolume) {
            volumeDown = volumeDown - 1;
        }
        if (volumeDown < minVolume) {
            return;
        } else if (volumeDown >= 11) {
            volumeDown = 10;
        }
        this.volumeDown = volumeDown;
    }

    public int getTurnDownTheVolume() {
        return volumeDown;
    }

    //Переключение радиостанций.

    public void setNextAndPrevStation(int checkStation) {

        if (checkStation > maxStation) {
            return;
        }
        if (checkStation < minStation) {
            checkStation = maxStation;
        }
        this.nextStation = checkStation;
    }

    public int getNextAndPrevStation() {

        return nextStation;
    }


}

//Тест дизайн. Минимум Максимум Середина Минзагр Максзагр