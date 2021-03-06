import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;

/**
 * A representation of a Pawn in a game of Chess.
 * 
 * @author Jalen Smith 
 * @version 4/23/15
 */
public class Pawn extends ChessPiece
{
    /** description of instance variable x (add comment for each instance variable) */
   

    /**
     * Default constructor for objects of class Pawn
     */
    public Pawn(int type)
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
        super.moveTo(newLocation);
    }

}
