package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.Constants;

import java.util.Optional;

public class Scissors extends BaseAction {


    public Scissors(String name, String iconUrl,ActionEnum actionEnum) {
        super(name,iconUrl,actionEnum);
    }


    @Override
    public String compare(Optional<IAction> action) {

        if(!action.isPresent()){
            return  buildMessage(Constants.INVALID_INPUT,"");
        }
        if(ActionEnum.SCISSORS == action.get().getType()) {
            return  buildMessage(Constants.C_TIE,"");
        }else  if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(Constants.C_SCISSORS_VS_PAPER, Constants.C_WIN);
        }else if(ActionEnum.ROCK == action.get().getType()) {
            return  buildMessage(Constants.C_ROCK_VS_SCISSORS, Constants.C_LOSE);
        }

        return  buildMessage(Constants.INVALID_INPUT,"");

    }
}
