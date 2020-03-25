package com.example.demo.controller;

import com.example.demo.constants.Constants;
import com.example.demo.factory.ActionFactory;
import com.example.demo.oldfashion.gui.StringListener;
import com.example.demo.model.actions.IAction;
import com.example.demo.model.players.AutoPlayer;
import com.example.demo.model.players.IPlayer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Optional;

public class ActionController implements IActionController  {

    private IPlayer autoPlayer=new AutoPlayer();

    private StringListener textListener  ;

    public void setTextListener(StringListener textListener) {
        this.textListener = textListener;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        JButton clicked = (JButton)actionEvent.getSource();
        Optional<IAction> userChoice=  ActionFactory.getActionByName(clicked.getText());

        Optional<IAction> autoChoice= autoPlayer.play() ;
        String text= Constants.INVALID_INPUT;
        if(userChoice.isPresent()){
          text=  userChoice.get().compare(autoChoice);
        }
        textListener.textEmitted(userChoice.get().getName(),autoChoice.get().getName(),text);
    }



}
