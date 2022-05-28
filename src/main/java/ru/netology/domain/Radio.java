package ru.netology.domain;

public class Radio {

    private String upVol = "+";
    private String downVol = "-";
    private String nextStation = "next";
    private String prevStation = "prev";

    private int maxVolume = 10;
    private int maxStation = 9;
    private int minVolume = 0;
    private int minStation = 0;

    private int checkStation;
    private int checkVolume;

    private String nextVolUp;
    private String nextVolDown;
    private String nextRadiostation;
    private String prevRadiostation;


    //Переключение каналов радиостанции Prev и Next.
    //NEXT.
    public void setRadiostationNext(String nextRadiostation) {

        this.nextRadiostation = nextRadiostation;
    }

    public String getRadiostationNext() {
        return nextRadiostation;
    }

    public void radiostationNextCalculate() {
        if (nextRadiostation == nextStation) ;
        return;
    }


    //PREV
    public void setRadiostationPrev(String prevRadiostation) {
        this.prevRadiostation = prevRadiostation;
    }

    public String getRadiostationPrev() {
        return prevRadiostation;
    }

    public void radiostationPrevCalculate() {
        if (prevRadiostation == prevStation) {
            return;
        }
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


    //Уровень звука +.
    public void setNextVolumeUpCalculate(String nextUp) {
        this.nextVolUp = nextUp;
    }

    public String getNextVolumeUpCalculate() {
        return nextVolUp;
    }

    public void nextVolumUpCalculate() {
        if (nextVolUp == upVol) {
            return;
        }
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


    //Уровень звука -.
    public void setNextVolumeDownCalculate(String nextDown) {
        this.nextVolDown = nextDown;
    }

    public String getNextVolumeDownCalculate() {
        return nextVolDown;
    }

    public void nextVolumeDownCalculate() {
        if (nextVolDown == downVol) {
            return;
        }
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
