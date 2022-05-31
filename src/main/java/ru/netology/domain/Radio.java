package ru.netology.domain;

public class Radio {


    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    private int checkStation;
    private int checkVolume;
    private int next;
    private int prev;


    public int stationSwitching = -1; //Прямое указание номера для радиостанции.


    //Next.
    public void setNextStation(int next) {
        this.next = next;
        setEnterStation(next);
    }

    public int getNextStation() {

        return checkStation;
    }

    //Prev.
    public void setPrevStation(int prev) {
        this.prev = prev;
        setEnterStation(prev);
    }

    public int getPrevStation() {

        return checkStation;
    }

    //Прямое указание номера для радиостанции.
    public void radioStationSwitching() {
        this.stationSwitching = stationSwitching;
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
