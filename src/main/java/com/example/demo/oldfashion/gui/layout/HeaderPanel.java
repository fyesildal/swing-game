package com.example.demo.oldfashion.gui.layout;

import javax.swing.*;
import java.awt.*;


public class HeaderPanel extends JPanel  {


	JLabel  label;

	public HeaderPanel() {
		setBorder(BorderFactory.createEtchedBorder());

		label = new JLabel("Make your choice!");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));

		add(label);


	}
	




}
