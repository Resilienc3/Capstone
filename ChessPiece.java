import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.awt.Color;
/**
 * Write a description of class ChessPiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessPiece extends Actor
{
    /** description of instance variable x (add comment for each instance variable) */
    private int type;

    /**
     * Default constructor for objects of class ChessPiece
     */
    public ChessPiece(int type)
    {
        super();
        setColor(Color.WHITE);
        this.type = type;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int getType()
    {
        return type;
    }

    

}
