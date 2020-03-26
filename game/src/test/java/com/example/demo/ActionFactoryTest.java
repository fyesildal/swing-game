package com.example.demo;


import com.example.demo.constants.ActionEnum;
import com.example.demo.factory.ActionFactory;
import com.example.demo.model.actions.IAction;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class ActionFactoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test_FactoryNotNull() {
        assertNotNull(ActionFactory.getInstance());
    }

    @Test
    public void test_FactoryItemsNotNull() {
        assertNotNull(ActionFactory.getInstance().getItems());
        assertTrue(ActionFactory.getInstance().getItems().size() == ActionEnum.values().length);

    }

    @Test
    public void test_ActionEnumsAllPresent() {
        Arrays.stream(ActionEnum.values()).forEach(
                e -> {
                    assertTrue(ActionFactory.getInstance().getActionByName(e.getActionName()).isPresent());
                }
        );

    }

    @Test
    public void test_ActionEnumsGetByOrder() {
        for (int i = 0; i < ActionEnum.values().length; i++) {
            ActionEnum actionEnum = ActionEnum.values()[i];
            Optional<IAction> action = ActionFactory.getInstance().getActionByOrder(i);
            assertTrue(action.isPresent());
            assertTrue(action.get().getType()!=null);
        }
    }


}





