package ru.netology.radio;

public class Radio {
    private int currentNumberRadio;
    private int currentNumberVolume;
    private int amountStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getCurrentNumber() {
        return currentNumberRadio;
    }


    public int setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < amountStation) {

            currentNumberRadio = newCurrentNumber;
        }
        return currentNumberRadio;
    }

    public int setCurrentNumberVolume(int newCurrentNumber) {
        currentNumberVolume = newCurrentNumber;
        return currentNumberVolume;
    }

    public int increaseVolume() {
        currentNumberVolume += 1;
        if (currentNumberVolume > maxVolume) {
            currentNumberVolume = maxVolume;
        }
        return currentNumberVolume;
    }


    public int decreaseVolume() {
        currentNumberVolume -= 1;
        if (currentNumberVolume < minVolume) {
            currentNumberVolume = minVolume;
        }
        return currentNumberVolume;
    }


    public int next() {
        currentNumberRadio += 1;
        if (currentNumberRadio > amountStation - 1) {
            currentNumberRadio = 0;
        }
        return currentNumberRadio;
    }


    public int prev() {
        currentNumberRadio -= 1;
        if (currentNumberRadio < 0) {
            currentNumberRadio = amountStation - 1;
        }
        return currentNumberRadio;
    }


}

