package com.example.demo.gui;

import com.example.demo.utils.Utils;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HeaderPanel extends JPanel  {


	JLabel  label;

	public HeaderPanel() {
		setBorder(BorderFactory.createEtchedBorder());

		label = new JLabel("Make your choice!");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        this.setSize(600,200);

		add(label);


	}
	




}
