import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * Write a description of class Board here.
 * 
 * @author Jalen Smith 
 * @version 4/15/15
 */
public class Board 
{
    /** description of instance variable x (add comment for each instance variable) */
    private ActorWorld world;

    private final int ROWS = 8;
    private final int COLS = 8;

    /**
     * Default constructor for objects of class Board
     */
    public Board()
    {
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        //puts black pieces minus pawns
        new BlackKing().putSelfInGrid(grid, new Location(0,3));
        new BlackQueen().putSelfInGrid(grid, new Location(0,4));
        new BlackBishop().putSelfInGrid(grid, new Location(0,2));
        new BlackBishop().putSelfInGrid(grid, new Location(0,5));
        new BlackKnight().putSelfInGrid(grid, new Location(0,1));
        new BlackKnight().putSelfInGrid(grid, new Location(0,6));
        new BlackRook().putSelfInGrid(grid, new Location(0,0));
        new BlackRook().putSelfInGrid(grid, new Location(0,7));
        // puts white pieces minus pawns
        new King().putSelfInGrid(grid, new Location(7,3));
        new Queen().putSelfInGrid(grid, new Location(7,4));
        new Bishop().putSelfInGrid(grid, new Location(7,2));
        new Bishop().putSelfInGrid(grid, new Location(7,5));
        new Knight().putSelfInGrid(grid, new Location(7,1));
        new Knight().putSelfInGrid(grid, new Location(7,6));
        new Rook().putSelfInGrid(grid, new Location(7,0));
        new Rook().putSelfInGrid(grid, new Location(7,7));

        //puts in pawns
        for(int i = 0; i< 8; i++){
            new BlackPawn().putSelfInGrid(grid, new Location(1,i));
            new Pawn().putSelfInGrid(grid, new Location(6,i));
        }

        world = new ActorWorld(grid);
        world.setMessage("Chess");
        world.show();
    }

    public static void main(String[] args)
    {
        Board b= new Board();
    }
}
