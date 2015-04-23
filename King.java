
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends ChessPiece
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class King
     */
    public King(int type)
    {
        super(type);
    }
    

    


    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void moveTo(Location newLocation)
    {
        if(newLocation.getRow() == this.getLocation().getRow()-1 && 
            this.getGrid().isValid(newLocation) == true||
            newLocation.getRow() == this.getLocation().getRow()+1 && 
            this.getGrid().isValid(newLocation) == true||
            newLocation.getCol() == this.getLocation().getCol()-1 &&
            this.getGrid().isValid(newLocation) == true||
            newLocation.getCol() == this.getLocation().getCol()+1 &&
            this.getGrid().isValid(newLocation) == true)
            {
             if(this.getGrid().get(newLocation) == null)
                super.moveTo(newLocation);
             else if(this.getGrid().get(newLocation).getType() != this.getType())
                super.moveTo(newLocation);
                
            }
            
            
        
    }
    
}
