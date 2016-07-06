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
    List<Originator.Memento> savedStates = new ArrayList<>();

    @Before
    public void setUp() throws Exception{
        originator = new Originator();
    }

    @After
    public void tearDown() throws Exception{
        originator = null;
    }

    @Test
    public void caretaker() throws Exception {
        originator.set("State 1");
        savedStates.add(originator.saveToMemento());
        originator.set("State 2");
        savedStates.add(originator.saveToMemento());
        originator.set("State 3");
        savedStates.add(originator.saveToMemento());
        originator.set("State 4");
        savedStates.add(originator.saveToMemento());

        originator.restoreFromMemento(savedStates.get(3));
    }
}
