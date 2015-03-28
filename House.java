import java.util.*;
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    // instance variables - replace the example below with your own
    private Map<Integer, Room> rooms;

    /**
     * Constructor for objects of class House
     */
    public House()
    {
        // initialise instance variables
        rooms = new HashMap<Integer, Room>();
    }
    
    /**
     * Add a room to the house.
     * I don't know quite what to do here: obviously this just calls the Room constructor, but
     * do i feed it the room object.
     */
    public void addRoom(int id, boolean dirt, String name)
    {
      Room temp = new Room(id, dirt, name);
      rooms.put(id, temp);
    }

    /**
     * Returns a specific room of the house for inspection, e.g. for agent to perceive its location
     *
     * @param  roomID   ID of desired room
     * @return          a Room object
     */
    public Room getRoom(int roomID)
    {
        // put your code here
        return rooms.get(roomID);
    }

    
}
