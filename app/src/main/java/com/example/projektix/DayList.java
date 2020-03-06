package com.example.projektix;

import java.util.ArrayList;

public class DayList {
    private static final DayList ourInstance = new DayList();
    ArrayList<Day> Days;

    public static DayList getInstance() {
        return ourInstance;
    }

    private DayList() {
        Days = new ArrayList<>();
        int i;
        for (i = 0; i <= 30; i++) {
            Days.add(new Day(dayNumber = i, status = false));
        }

    }
    public Day getDay(int i) {
        return Days.get(i);
    }
}
