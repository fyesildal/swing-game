package com.example.demo.constants;



public enum  ActionEnum {
    PAPER("Paper"),
    ROCK("Rock"),
    SCISSORS("Scissors"),
    UNKNOWN("Unknown");

    private String name;

    private  ActionEnum(String name){
        this.name=name;
    }

}
