package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;

import java.util.Optional;

public interface IAction {

    public  String getName();

    public default ActionEnum getType(){
        return ActionEnum.PAPER;
    }
    public  String getIcon();

    public String compare(Optional<IAction> action);
}
