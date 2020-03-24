package com.example.demo.gui;

import com.example.demo.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
	private JButton paperButton;
	private JButton rockButton;
	private JButton scissorButton;
	
	private StringListener textListener;
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());

		paperButton = new JButton("Paper");
		rockButton = new JButton("Rock");
		scissorButton = new JButton("Scissors");


		paperButton.setIcon(Utils.createIcon("images/paper.png"));
		rockButton.setIcon(Utils.createIcon("images/rock.png"));
		scissorButton.setIcon(Utils.createIcon("images/scissors.png"));

		paperButton.addActionListener(this);
		rockButton.addActionListener(this);
		scissorButton.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.LEFT,50,10));

		add(paperButton);
		add(rockButton);
		add(scissorButton);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}


	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == paperButton) {
			if(textListener != null) {
				textListener.textEmitted("Paper\n");
			}
		}
		else if(clicked == rockButton) {
			if(textListener != null) {
				textListener.textEmitted("Rock\n");
			}
		}
		else if(clicked == scissorButton) {
			if(textListener != null) {
				textListener.textEmitted("Scissor\n");
			}
		}
	}
}
