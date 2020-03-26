package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.ApplicationConstants;

import java.util.Optional;

public class Scissors extends BaseAction {


    public Scissors(String iconUrl,ActionEnum actionEnum) {
        super(iconUrl,actionEnum);
    }


    @Override
    public String compare(Optional<IAction> action) {

        if(!action.isPresent()){
            return  buildMessage(ApplicationConstants.INVALID_INPUT,"");
        }
        if(ActionEnum.SCISSORS == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_TIE,"");
        }else  if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_SCISSORS_VS_PAPER, ApplicationConstants.C_WIN);
        }else if(ActionEnum.ROCK == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_ROCK_VS_SCISSORS, ApplicationConstants.C_LOSE);
        }

        return  buildMessage(ApplicationConstants.INVALID_INPUT,"");

    }
}
