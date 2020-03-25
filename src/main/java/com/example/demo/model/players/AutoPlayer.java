package com.example.demo.model.players;

import com.example.demo.factory.ActionFactory;
import com.example.demo.model.actions.IAction;

import java.util.Optional;
import java.util.Random;

public class AutoPlayer  implements IPlayer {


    @Override
    public Optional<IAction> play() {
        Random generator = new Random();
        Integer order = generator.nextInt(3);
        return  ActionFactory.getActionByOrder(order);


    }
}
