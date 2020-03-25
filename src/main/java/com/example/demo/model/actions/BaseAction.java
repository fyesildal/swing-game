package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;

public abstract class BaseAction implements IAction {
    protected String name = "";
    protected String iconUrl;



    protected  ActionEnum  type;

    public BaseAction(String name, String iconUrl,ActionEnum type) {
        this.name = name;
        this.iconUrl = iconUrl;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return iconUrl;
    }
    public  ActionEnum getType(){
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return  paper.getType()==type;
    }


    protected String  buildMessage(String message, String status){

        return message + status;
    }
}
