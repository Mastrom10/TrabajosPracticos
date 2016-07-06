package MementoPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matias Malerba on 06/07/2016.
 */
public class CaretakerTest {
    Originator originator;
    Caretaker caretaker;

    @Before
    public void setUp() throws Exception{
        originator = new Originator();
        caretaker = new Caretaker();

        //Seteo tantos estados del objeto como quiera
        originator.set("State 1");
        originator.set("State 2");
        //Guardo estados en la lista
        caretaker.savedStates.add(originator.saveToMemento());
        originator.set("State 3");
        caretaker.savedStates.add(originator.saveToMemento());
        originator.set("State 4");

    }

    @After
    public void tearDown() throws Exception{
        originator = null;
        caretaker = null;

    }

    @Test
    public void caretaker() throws Exception {
        originator.restoreFromMemento(caretaker.savedStates.get(1));
    }
}
