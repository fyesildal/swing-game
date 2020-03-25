package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.Constants;

import java.util.Optional;

public class Paper extends BaseAction {

    public Paper(String name, String iconUrl) {
        super(name,iconUrl,ActionEnum.PAPER);
    }


    @Override
    public String compare(Optional<IAction> action) {

        if(!action.isPresent()){
           return  buildMessage(Constants.INVALID_INPUT,"");
        }
        if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(Constants.C_TIE,"");
        }else  if(ActionEnum.ROCK == action.get().getType()) {
            return  buildMessage(Constants.C_PAPER_VS_ROCK, Constants.C_WIN);
        }else if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(Constants.C_SCISSORS_VS_PAPER, Constants.C_LOSE);
        }

        return  buildMessage(Constants.INVALID_INPUT,"");

    }






}