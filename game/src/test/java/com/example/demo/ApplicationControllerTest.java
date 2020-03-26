package com.example.demo;


import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.ApplicationConstants;
import com.example.demo.controller.ApplicationController;
import com.example.demo.factory.ActionFactory;
import com.example.demo.model.actions.IAction;
import com.example.demo.model.players.AutoPlayer;
import com.example.demo.model.players.IPlayer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationControllerTest {

    ApplicationController applicationController;

    @Mock
    IPlayer userPlayer;


    IPlayer autoPlayer;

    @Before
    public void setUp() throws Exception {
        Mockito.when(userPlayer.play()).thenReturn(
                ActionFactory.getInstance().getAction(ActionEnum.ROCK)
        );
        this.autoPlayer=new AutoPlayer();
        applicationController=new ApplicationController(ApplicationConstants.C_APP_NAME,autoPlayer  );
        JFrame frame=applicationController.createFrame(ActionFactory.getInstance().getItems(),false);
    }


    @Test()
    public void test_ActionListener() {
         JButton button =new JButton();
         button.setText(userPlayer.play().get().getName());
         button.addActionListener(applicationController);

        int count=10;
        IntStream.range(0, count).forEach(i ->
                {
                    button.doClick();
                }
        );

        assertTrue(!applicationController.getOutputText().isEmpty());
        String[] lines=applicationController.getOutputText().split("\n");
        assertTrue(lines.length==count+1);
        IntStream.range(1, count+1).forEach(i ->
                {
                    assertTrue(lines[i].contains(userPlayer.play().get().getName()));

                }
        );

    }
}





