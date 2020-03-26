package com.example.demo;


import com.example.demo.model.actions.IAction;
import com.example.demo.model.players.AutoPlayer;
import com.example.demo.model.players.IPlayer;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;
import java.util.stream.IntStream;

public class AutoPlayerTest  {

    private IPlayer player;

    @Before
    public void setUp() throws Exception {
        this.player = new AutoPlayer();
    }

    @Test
    public void test_Play() {
        IntStream.range(0, 1000).parallel().forEach(i ->
        {
            Optional<IAction> action =player.play();
            assertTrue(action.isPresent());
        }
        );
    }
}
