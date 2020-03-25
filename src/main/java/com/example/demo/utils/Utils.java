package com.example.demo.utils;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Utils {

	public static ImageIcon createIcon(String path) {
		URL url = Utils.class.getClassLoader().getResource(path);
		ImageIcon icon = new ImageIcon(url);

		return icon;
	}


}
