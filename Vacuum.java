
import java.util.*;
import java.io.*;
/**
 * @author Jonathan
 * A very simple model for a vacuum agent. Determines a state from a perceive() method, makes decisions
 * based on that state. Actions it can take are to clean, or to 'leave the room' e.g move in a random direction.
 * This agent will bump into walls, e.g. it does not percieve the available exits, but it shouldn't try the same
 * invalid direction twice.
 */
public class Vacuum {
    private State state;
    public Vacuum(House myHouse, int location)
    {
        //Constructor for a vacuum agent takes a room ID for the starting location of a vacuum. 
        //What if the location given is not a valid room in the house? I don't know lmao.
       state = new State(location); //the vacuum doesn't know if the room is dirty yet
       System.out.println("A new vacuum has been spawned in the " + myHouse.getRoom(location).getName());
       
    }
    
}
