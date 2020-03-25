package com.example.demo;



import com.example.demo.constants.Constants;
import com.example.demo.controller.ActionController;
import com.example.demo.factory.ActionFactory;
import com.example.demo.oldfashion.gui.MainFrame;

import javax.swing.*;


public class GameApplication {

	public static void main(String[] args) {
		ActionFactory.createItems();
		ActionController controller=new ActionController();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame(Constants.C_APP_NAME,ActionFactory.getItems(),controller);
			}
		});

		//new SpringApplicationBuilder(SpringDesktopSampleApplication.class).headless(false).run(args);
	}

}
