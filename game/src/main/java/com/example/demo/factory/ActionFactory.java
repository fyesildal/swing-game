package com.example.demo.factory;

import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.ApplicationConstants;
import com.example.demo.model.actions.IAction;
import com.example.demo.model.actions.Paper;
import com.example.demo.model.actions.Rock;
import com.example.demo.model.actions.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActionFactory {

    private static ActionFactory instance;
    private List<IAction> items = new ArrayList<IAction>();

    private ActionFactory() {
    }

    public static ActionFactory getInstance() {
        if (instance == null) {
            ActionFactory.instance = new ActionFactory();
        }
        return instance;
    }

    private List<IAction> getItemList() {
        if (this.items.isEmpty()) {
            initItems();
        }
        return this.items;
    }

    public List<IAction> getItems() {
        return new ArrayList<>(getItemList());
    }

    private IAction create(ActionEnum actionEnum) {
        if (ActionEnum.PAPER == actionEnum) {
            return new Paper(ApplicationConstants.C_PAPER_URL, ActionEnum.PAPER);
        }
        if (ActionEnum.ROCK == actionEnum) {
            return new Rock(ApplicationConstants.C_ROCK_URL, ActionEnum.ROCK);
        }
        if (ActionEnum.SCISSORS == actionEnum) {
            return new Scissors(ApplicationConstants.C_SCISSORS_URL, ActionEnum.SCISSORS);
        }
        throw new IllegalArgumentException(ApplicationConstants.INVALID_INPUT);

    }

    private void initItems() {
        IAction paper = create(ActionEnum.PAPER);
        IAction rock = create(ActionEnum.ROCK);
        IAction scissors = create(ActionEnum.SCISSORS);

        items.add(paper);
        items.add(rock);
        items.add(scissors);
    }

    public Optional<IAction> getActionByName(String name) {
        return getItemList().stream().filter(e -> e.getName().equals(name)).findFirst();
    }


    public Optional<IAction> getAction(ActionEnum actionEnum) {
        return  getActionByName(actionEnum.getActionName());
    }
    public Optional<IAction> getActionByOrder(Integer order) {
        if (order < getItems().size()) {
            return Optional.of(getItems().get(order));
        }
        return Optional.ofNullable(null);
    }


}





