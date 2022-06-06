package ru.netology.domain;

public class Radio {


    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    private int checkStation;
    private int checkVolume;
    public int stationSwitching = 5; //Прямое указание номера для радиостанции.


    //NEXT

    //PREV

    //Прямое указание номера для радиостанции.
    public void radioStationSwitching() {

        setEnterStation(stationSwitching);
    }


    //Код данных Get и Set для переключения каналов.
    public void setEnterStation(int checkStation) {

        this.checkStation = checkStation;
    }

    public int getEnterStation() {

        return checkStation;
    }

    //Переключение каналов Радиостанции. (Код вычесления валидности введенного числа от 0 до 9)
    public void checkYourRadioStationNumber() {
        if (checkStation <= maxStation & checkStation >= minStation) {
            return;
        } else if (checkStation < minStation) {
            checkStation = maxStation;
            return;
        }
        checkStation = minStation;
        return;
    }


    //Переключение уровня громкости звука.

    public void setCheckVolume(int checkVolume) {

        this.checkVolume = checkVolume;
    }

    public int getCheckVolume() {

        return checkVolume;
    }

    //Переключение уровня громкости звука - больше (Up).
    public void checkYourVolumeUpNumber() {
        if (checkVolume <= maxVolume & checkVolume >= minVolume) {
            checkVolume++;
            return;
        } else if (checkVolume > maxVolume) {
            checkVolume = maxVolume;
            return;
        }
        checkVolume = minVolume;
        return;
    }


    //Переключение уровня громкости звука - меньше (Down).
    public void checkYourVolumeDownNumber() {
        if (checkVolume <= maxVolume & checkVolume >= minVolume) {
            checkVolume--;
            return;
        } else if (checkVolume > maxVolume) {
            checkVolume = maxVolume;
            return;
        }
        checkVolume = minVolume;
        return;
    }

}
