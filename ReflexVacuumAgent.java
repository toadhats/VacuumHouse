
import java.util.*;
import java.io.*;
/**
 * @author Jonathan
 * The simplest possible attempt at the simple reflex vacuum
 */
public class ReflexVacuumAgent {
    
    public static void ReflexVacuumAgent(int location, boolean dirtStatus  )
    {
        if (dirtStatus)
            System.out.println("Sucking up some dirt");
        else
            System.out.println("There's no dirt in this room");
        if (location == 1)
            System.out.println("Moving to room 2");
        else if (location == 2)
            System.out.println("Moving to room 1");
            
       
    };
}
