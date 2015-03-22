import java.util.*;
/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private int roomID;
    private boolean isDirty;
    private ArrayList<Exit> exits;
    private String roomName;
    

    /**
     * Constructor for objects of class Room
     */
    public Room(int id)
    {
        // initialise instance variables
        roomID = id;
        exits = new ArrayList<Exit>();
        isDirty = false;
        roomName = "An empty room";
    }
    
    /**
     * Constructor for objects of class Room
     * including dirt status
     */
    public Room(int id, boolean dirt)
    {
        // initialise instance variables
        roomID = id;
        exits = new ArrayList<Exit>();
        isDirty = dirt;
        roomName = "An empty room";
    }

    /**
     * Constructor for objects of class Room
     * including dirt status and room name
     */
    public Room(int id, boolean dirt, String name)
    {
        // initialise instance variables
        roomID = id;
        exits = new ArrayList<Exit>();
        isDirty = dirt;
        roomName = name;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getID()
    {
        // put your code here
        return roomID;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void addExit(String dir, int dest)
    {
        // put your code here
        System.out.println("Got direction:" + dir);
        System.out.println("Got destination:" + dest);
        Exit newExit = new Exit(dir, dest);
        exits.add(newExit);
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void debug_displayExits()
    {
        // put your code here
        for (Exit exit: exits)
        {
            System.out.println("There is an exit to the " + exit.getDirection() + 
                ", leading to room #" + exit.getDestination());
        }
        return;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public ArrayList getExits()
    {
        // put your code here
        return exits;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public boolean dirtCheck()
    {
        // put your code here
        return isDirty;
    }

    
    
}
