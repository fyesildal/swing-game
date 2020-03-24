package com.example.demo;



import com.example.demo.gui.MainFrame;

import javax.swing.*;


public class GameApplication {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});

		//new SpringApplicationBuilder(SpringDesktopSampleApplication.class).headless(false).run(args);
	}

}
