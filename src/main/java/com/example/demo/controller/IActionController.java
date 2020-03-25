package com.example.demo.controller;

import com.example.demo.oldfashion.gui.StringListener;

import java.awt.event.ActionListener;

public interface IActionController extends ActionListener {

    public void setTextListener(StringListener textListener);

}
