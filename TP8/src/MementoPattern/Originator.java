package MementoPattern;

/**
 * Created by Matias Malerba on 06/07/2016.
 */
public class Originator {

    private String state;

    public void set(String state){
        System.out.println("Originator: Setting state to: " + state);
        this.state = state;
    }

    public Memento saveToMemento(){
        System.out.println("Originator: Saving to Memento");
        return new Memento (this.state);
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public static class Memento {
        private final String state;

        public Memento(String stateToSave){
            state = stateToSave;
        }

        public String getSavedState(){
            return state;
        }
    }


}
