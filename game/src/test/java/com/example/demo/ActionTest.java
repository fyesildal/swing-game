package com.example.demo;


import com.example.demo.constants.ActionEnum;
import com.example.demo.constants.ApplicationConstants;
import com.example.demo.factory.ActionFactory;
import com.example.demo.model.actions.IAction;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class ActionTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test_PaperVsRock() {
        Optional<IAction> paper = ActionFactory.getInstance().getAction(ActionEnum.PAPER);
        Optional<IAction> rock = ActionFactory.getInstance().getAction(ActionEnum.ROCK);
        assertTrue(paper.isPresent() && rock.isPresent());
        String result = paper.get().compare(rock);
        assertTrue(result.contains(ApplicationConstants.C_WIN));
        assertTrue(result.contains(ApplicationConstants.C_PAPER_VS_ROCK));
    }

    @Test
    public void test_PaperVsScissors() {
        Optional<IAction> paper = ActionFactory.getInstance().getAction(ActionEnum.PAPER);
        Optional<IAction> scissors = ActionFactory.getInstance().getAction(ActionEnum.SCISSORS);
        assertTrue(paper.isPresent() && scissors.isPresent());
        String result = paper.get().compare(scissors);
        assertTrue(result.contains(ApplicationConstants.C_LOSE));
        assertTrue(result.contains(ApplicationConstants.C_SCISSORS_VS_PAPER));
    }

    @Test
    public void test_ScissorsVsRock() {
        Optional<IAction> scissors = ActionFactory.getInstance().getAction(ActionEnum.SCISSORS);
        Optional<IAction> rock = ActionFactory.getInstance().getAction(ActionEnum.ROCK);
        assertTrue(scissors.isPresent() && rock.isPresent());
        String result = scissors.get().compare(rock);
        assertTrue(result.contains(ApplicationConstants.C_LOSE));
        assertTrue(result.contains(ApplicationConstants.C_ROCK_VS_SCISSORS));
    }


    @Test
    public void test_ScissorsVsPaper() {
        Optional<IAction> scissors = ActionFactory.getInstance().getAction(ActionEnum.SCISSORS);
        Optional<IAction> paper = ActionFactory.getInstance().getAction(ActionEnum.PAPER);
        assertTrue(scissors.isPresent() && paper.isPresent());
        String result = scissors.get().compare(paper);
        assertTrue(result.contains(ApplicationConstants.C_WIN));
        assertTrue(result.contains(ApplicationConstants.C_SCISSORS_VS_PAPER));
    }

    @Test
    public void test_RockVsPaper() {
        Optional<IAction> rock = ActionFactory.getInstance().getAction(ActionEnum.ROCK);
        Optional<IAction> paper = ActionFactory.getInstance().getAction(ActionEnum.PAPER);
        assertTrue(paper.isPresent() && rock.isPresent());
        String result = rock.get().compare(paper);
        assertTrue(result.contains(ApplicationConstants.C_LOSE));
        assertTrue(result.contains(ApplicationConstants.C_PAPER_VS_ROCK));
    }

    @Test
    public void test_RockVsScissors() {
        Optional<IAction> rock = ActionFactory.getInstance().getAction(ActionEnum.ROCK);
        Optional<IAction> scissors = ActionFactory.getInstance().getAction(ActionEnum.SCISSORS);
        assertTrue(rock.isPresent() && scissors.isPresent());
        String result = rock.get().compare(scissors);
        assertTrue(result.contains(ApplicationConstants.C_WIN));
        assertTrue(result.contains(ApplicationConstants.C_ROCK_VS_SCISSORS));
    }



}





