
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit
{
    // instance variables - replace the example below with your own
    private String direction; //the compass direction that this exit points
    private int destination; //ID of the room this exit leads to

    /**
     * Constructor for objects of class Exit
     */
    public Exit(String newDir, int newDest)
    {
        direction = newDir;
        destination = newDest;
        System.out.println("Created a new exit to the " + direction + ", heading to room #" + destination);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String getDirection()
    {
        // put your code here
        return direction;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getDestination()
    {
        // put your code here
        return destination;
    }

}
