package com.example.demo.oldfashion.gui.layout;

import com.example.demo.constants.ApplicationConstants;

import javax.swing.*;
import java.awt.*;


public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	public TextPanel() {
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		add(new JScrollPane(textArea));
		this.append(ApplicationConstants.C_PLAYER, ApplicationConstants.C_COMPUTER, ApplicationConstants.C_STATUS);

	}
	
	public void append(String p,String  p2,String desc) {
		textArea.append(p +"	" + p2+"		"+desc +"\n");
	}

	public String geText() {
		return textArea.getText();
	}
}
