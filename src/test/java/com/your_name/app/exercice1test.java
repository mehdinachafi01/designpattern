package com.your_name.app;

import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class exercice1test {

    @Test
    public void testSingletonInstance() {

        DatabaseConnector Instance1 = DatabaseConnector.getInstance();
        DatabaseConnector Instance2 = DatabaseConnector.getInstance();

        assertSame(Instance1, Instance2, "Les deux appels à getInstance() devraient retourner la même instance");
    }
}