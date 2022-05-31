package ru.netology.domain;

public class Radio {


    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    private int checkStation;
    private int checkVolume;
    public int stationSwitching = 5; //Прямое указание номера для радиостанции.
    




    //NEXT    NEXT   NEXT   NEXT   NEXT

    public void next() {
        stationSwitching++;
        setEnterStation(stationSwitching);

    }

    //Прямое указание номера для радиостанции.
    public void radioStationSwitching() {
        //this.stationSwitching = stationSwitching;
        setEnterStation(stationSwitching);
    }


    //Переключение каналов Радиостанции.
    public void setEnterStation(int checkStation) {

        this.checkStation = checkStation;
    }

    public int getEnterStation() {

        return checkStation;
    }

    public void checkYourRadioStationNumber() {
        if (checkStation <= maxStation & checkStation >= minStation) {
            return;
        }
        if (checkStation < minStation) {
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
        }
        if (checkVolume > maxVolume) {
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
        }
        if (checkVolume > maxVolume) {
            checkVolume = maxVolume;
            return;
        }
        checkVolume = minVolume;
        return;
    }

}
