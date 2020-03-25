package com.example.demo.oldfashion.gui.layout;

import com.example.demo.constants.Constants;

import javax.swing.*;
import java.awt.*;


public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	public TextPanel() {
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		add(new JScrollPane(textArea));
		this.append(Constants.C_PLAYER, Constants.C_COMPUTER, Constants.C_STATUS);

	}
	
	public void append(String p,String  p2,String desc) {
		textArea.append(p +"	" + p2+"		"+desc +"\n");
	}
}
