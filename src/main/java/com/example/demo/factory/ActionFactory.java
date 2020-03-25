package com.example.demo.factory;

import com.example.demo.constants.ActionEnum;
import com.example.demo.model.actions.IAction;
import com.example.demo.model.actions.Paper;
import com.example.demo.model.actions.Rock;
import com.example.demo.model.actions.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActionFactory {

    private  List<IAction> items=new ArrayList<IAction>();

   private  static  ActionFactory instance;
    public static ActionFactory getInstance() {
        if(instance==null){
            ActionFactory.instance=new ActionFactory();
        }
        return instance;
    }

    private ActionFactory(){

   }
    public  List<IAction>  getItems() {
        if (items.isEmpty()) {
            initItems();
        }
        return items;

    }

   private  void initItems(){
       Paper paper = new Paper("Paper","images/paper.png", ActionEnum.PAPER);
       Rock rock = new Rock("Rock","images/rock.png",ActionEnum.ROCK);
       IAction scissors = new Scissors("Scissors","images/scissors.png",ActionEnum.SCISSORS);

       items.add(paper);
       items.add(rock);
       items.add(scissors);
   }

   public  Optional<IAction> getActionByName(String name){
       return  getItems().stream().filter(e->e.getName().equals(name)).findFirst();
   }

    public  Optional<IAction> getActionByOrder(Integer order){
            if(order <   getItems().size()){
                return   Optional.of(getItems().get(order));
            }
            return   Optional.ofNullable(null);
        }


   }





