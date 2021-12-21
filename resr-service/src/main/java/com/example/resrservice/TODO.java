package com.example.resrservice;

import java.time.LocalDate;

public class TODO {
    public TODO(String text, String actualTime) {
        this.text = text;
        this.actualTime = actualTime;
    }

    public String getText() {
        return text;
    }

    public String getActualTime() {
        return actualTime;
    }

    String text;
    String actualTime;


}