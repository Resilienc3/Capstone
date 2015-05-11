import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.awt.Color;
/**
 * A Chess Piece that has a color, a type (0 = White, 1 = Black) and sets and gets types.
 * 
 * @author (Jalen Smith) 
 * @version (4/23/15)
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
     *Sets this.type instance variable of a ChessPiece
     *
     * @param   type 0 = White, 1 =  Black
     * */
    public void setType(int type)
    {
        this.type = type;
    }
    
    /**
     *Gets this.type instance variable of a ChessPiece
     *
     * @return   type 0 = White, 1 =  Black
     */
    public int getType()
    {
        
        return type;
    }

    

    

}
