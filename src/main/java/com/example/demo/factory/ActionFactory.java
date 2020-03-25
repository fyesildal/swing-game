package com.example.demo.factory;

import com.example.demo.model.actions.IAction;
import com.example.demo.model.actions.Paper;
import com.example.demo.model.actions.Rock;
import com.example.demo.model.actions.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActionFactory {

   private static List<IAction> items=new ArrayList<IAction>();;

   public static List<IAction>  createItems() {
       if (items.isEmpty()) {
           initItems();
       }
       return items;

   }


    public static List<IAction>  getItems() {
        if (items.isEmpty()) {
            initItems();
        }
        return items;

    }

   private static void initItems(){
       Paper paper = new Paper("Paper","images/paper.png");
       Rock rock = new Rock("Rock","images/rock.png");
       IAction scissors = new Scissors("Scissors","images/scissors.png");

       items.add(paper);
       items.add(rock);
       items.add(scissors);
   }

   public static Optional<IAction> getActionByName(String name){
       return  getItems().stream().filter(e->e.getName().equals(name)).findFirst();
   }

    public static Optional<IAction> getActionByOrder(Integer order){
            if(order <   getItems().size()){
                return   Optional.of(getItems().get(order));
            }
            return   Optional.ofNullable(null);
        }


   }





