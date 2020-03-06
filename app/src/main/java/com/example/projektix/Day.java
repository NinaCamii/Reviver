package com.example.projektix;

public class Day {
    private int dayNumber;
    private String guide;
    private boolean status;

    public Day(int dayNumber, boolean status) {
        this.dayNumber = dayNumber;
        this.status = status;
    }

    public int getdayNumber() {
        return this.dayNumber;
    }

    public boolean getStatus() {
        return this.status;
    }

}
