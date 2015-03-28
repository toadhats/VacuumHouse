
/**
 * Prototype/abstract model for a state. Diiferent vacuums should maybe implement their own 
 * versions/descendants of this class to implement their added functionality? I'm not too good
 * with properly modular code just yet.
 *
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class State
{
    // instance variables - replace the example below with your own
    private int currentRoom;//or would it be better to store a whole Room object in the state??
    private boolean dirtStatus;//If I stored a whole Room object, dirtStatus here would be redundant.

    /**
     * Default Constructor for objects of class State
     */
    public State()
    {
        //default constructor creates a state where room ID is default/unknown. This probably isn't something
        //I'd want to use in most cases.
        //dirtStatus attribute is null - an agent that finds its dirtStatus is null should check if there is dirt I guess
        currentRoom = 0;
        //dirtStatus = null; //ok apparently you can't set a boolean to null
    }
    
    /**
     * Constructor for objects of class State
     */
    public State(int room)
    {
        //roomID is known now, but dirtStatus attribute is null - an agent that finds its dirtStatus is null should check if there is dirt.
        //Then again is there any meaningful difference between creating a state and 'updating' an existing one????
        currentRoom = room;
        //dirtStatus = null;
    }

    /**
     * 'Complete' Constructor for objects of class State
     */
    public State(int room, boolean dirt)
    {
        //This is the constructor for a 'fully formed' state. 
        //This might end up being the only constructor I actually use???
        currentRoom = room;
        dirtStatus = dirt;
    }
}
