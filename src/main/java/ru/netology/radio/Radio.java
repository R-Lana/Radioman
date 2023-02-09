package ru.netology.radio;

public class Radio {
    private int currentNumberRadio;
    public int currentNumberVolume;


    public int getCurrentNumber() {
        return currentNumberRadio;
    }


    public int setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > 9) {
            while (newCurrentNumber > 9) {
                newCurrentNumber = newCurrentNumber / 10;
            }
        }
        currentNumberRadio = newCurrentNumber;
        return currentNumberRadio;
    }


    public int increaseVolume() {
        currentNumberVolume += 1;
        if (currentNumberVolume > 10) {
            currentNumberVolume = 10;
        }
        return currentNumberVolume;
    }


    public int decreaseVolume() {
        currentNumberVolume -= 1;
        if (currentNumberVolume < 0) {
            currentNumberVolume = 0;
        }
        return currentNumberVolume;
    }


    public int next() {
        currentNumberRadio += 1;
        if (currentNumberRadio > 9) {
            currentNumberRadio = 0;
        }
        return currentNumberRadio;
    }


    public int prev() {
        currentNumberRadio -= 1;
        if (currentNumberRadio < 0) {
            currentNumberRadio = 9;
        }
        return currentNumberRadio;
    }


}

