package com.example.demo.controller;

import com.example.demo.model.actions.IAction;
import com.example.demo.model.players.IPlayer;
import com.example.demo.oldfashion.gui.MainFrame;
import com.example.demo.oldfashion.gui.layout.StringListener;

import javax.swing.*;
import java.util.List;

public abstract class ApplicationControllerBase implements IApplicationController {

    protected IPlayer autoPlayer;
    protected StringListener textListener;
    protected String appName;

    public ApplicationControllerBase(String appName, IPlayer player) {
        this.autoPlayer = player;
        this.appName = appName;

    }

    public void setTextListener(StringListener textListener) {
        this.textListener = textListener;
    }

    public String getOutputText() {
        return this.textListener.getText();
    }

    public JFrame createFrame(List<IAction> items, boolean visible) {
        return new MainFrame(appName, items, this, visible);
    }

    public JFrame createFrame(List<IAction> items) {
        return createFrame(items, true);
    }


}
