
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
/**
 * A representation of a King in a game of Chess.
 * 
 * @author Jalen Smith 
 * @version 4/23/15
 */
public class King extends ChessPiece
{
    

    /**
     * Default constructor for objects of class King
     */
    public King(int type)
    {
        super(type);
    }

    /**
     * Overides moveTo method of Actors to fit the game of Chess
     *
     * @pre        Assumes piece is in the grid
     * @post    If a piece is in the location that it is moved to, that piece will be removed from grid
     * @param    newLocation - The Location you wish to move the piece to.
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
             else if(((ChessPiece)(this.getGrid().get(newLocation))).getType() != this.getType())
                super.moveTo(newLocation);
                
            }
            
            
        
    }
    
}
