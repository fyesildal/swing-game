package com.example.demo.oldfashion.gui;

import com.example.demo.controller.IApplicationController;


import com.example.demo.oldfashion.gui.layout.HeaderPanel;
import com.example.demo.oldfashion.gui.layout.StringListener;
import com.example.demo.oldfashion.gui.layout.TextPanel;
import com.example.demo.oldfashion.gui.layout.Toolbar;
import com.example.demo.model.actions.IAction;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class MainFrame extends JFrame {


	private HeaderPanel headerPanel;;
	private Toolbar toolbar;
	private TextPanel textPanel;


	public MainFrame(String header, List<IAction> items, IApplicationController controller) {
          this(header,items,controller,true);
	}

	
	public MainFrame(String header, List<IAction> items, IApplicationController controller,boolean visible) {

		super(header);
		setLayout(new BorderLayout());
		headerPanel = new HeaderPanel();
		toolbar = new Toolbar(items,controller);
		textPanel = new TextPanel();

        JPanel nested1 = new JPanel(); // FlowLayout
        nested1.setLayout(new BorderLayout());

        nested1.add(headerPanel,BorderLayout.NORTH);
        nested1.add(toolbar,BorderLayout.CENTER);

		//add(headerPanel,BorderLayout.NORTH);
		add(nested1,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);


		controller.setTextListener(new StringListener() {
			public void textEmitted(String p, String p2,String desc) {
				textPanel.append(p,p2,desc);
			}
			public String getText() {
			  return textPanel.geText();
			}
		});

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(visible);
	}
}
