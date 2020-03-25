package com.example.demo.oldfashion.gui.layout;

import com.example.demo.controller.IActionController;
import com.example.demo.model.actions.IAction;
import com.example.demo.utils.Utils;

import javax.swing.*;
import java.awt.*;

import  java.util.List;


public class Toolbar extends JPanel  {


	
	public Toolbar(List<IAction> items, IActionController actionController) {
		setBorder(BorderFactory.createEtchedBorder());

        setLayout(new FlowLayout(FlowLayout.LEFT,63,20));


		for(IAction i : items){
            JButton button = new JButton(i.getName());
            button.setIcon(Utils.createIcon(i.getIcon()));
            button.addActionListener(actionController);
            this.add(button);

		}

	}
	



}
