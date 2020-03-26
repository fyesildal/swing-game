package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;

public abstract class BaseAction implements IAction {
    protected String iconUrl;



    protected  ActionEnum  type;

    public BaseAction(String iconUrl,ActionEnum type) {
        this.iconUrl = iconUrl;
        this.type = type;
    }

    public String getName() {
        return type.getActionName();
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
        BaseAction baseAction = (BaseAction) o;
        return  baseAction.getType()==type;
    }

    @Override
    public String toString() {
        return type.name();
    }

    protected String  buildMessage(String message, String status){

        return message + status;
    }
}
