package com.example.demo.gui;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {


	private HeaderPanel headerPanel;;
	private Toolbar toolbar;
	private TextPanel textPanel;
	
	public MainFrame() {
		super("Paper-Rock-Scissors Game");
		
		setLayout(new FlowLayout());

		headerPanel = new HeaderPanel();

		toolbar = new Toolbar();
		textPanel = new TextPanel();
		textPanel.setBackground(Color.WHITE);
		//textPanel.setEnabled(false);

		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});

		add(headerPanel);
		add(toolbar);
		add(textPanel);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
