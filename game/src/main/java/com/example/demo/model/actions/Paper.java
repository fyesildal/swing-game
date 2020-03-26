package com.example.demo.model.actions;

import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.ApplicationConstants;

import java.util.Optional;

public class Paper extends BaseAction {

    public Paper( String iconUrl,ActionEnum actionEnum) {
        super(iconUrl,actionEnum);
    }


    @Override
    public String compare(Optional<IAction> action) {

        if(!action.isPresent()){
           return  buildMessage(ApplicationConstants.INVALID_INPUT,"");
        }
        if(ActionEnum.PAPER == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_TIE,"");
        }else  if(ActionEnum.ROCK == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_PAPER_VS_ROCK, ApplicationConstants.C_WIN);
        }else if(ActionEnum.SCISSORS == action.get().getType()) {
            return  buildMessage(ApplicationConstants.C_SCISSORS_VS_PAPER, ApplicationConstants.C_LOSE);
        }

        return  buildMessage(ApplicationConstants.INVALID_INPUT,"");

    }






}
