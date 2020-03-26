package com.example.demo.constants;



public enum  ActionEnum {
    PAPER(ApplicationConstants.C_PAPER),
    ROCK(ApplicationConstants.C_ROCK),
    SCISSORS(ApplicationConstants.C_SCISSORS)
    ;

    private String actionName;

    private  ActionEnum(String name){
        this.actionName=name;
    }

    public String getActionName(){
        return actionName;
    }

}
