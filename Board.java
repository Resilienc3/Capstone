import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import java.util.ArrayList;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * Board is a chess board that puts pieces in place and runs the gridworld necessary to play the game.
 * 
 * @author Jalen Smith 
 * @version 4/15/15
 */
public class Board 
{
    /** description of instance variable x (add comment for each instance variable) */
    //World that will be displayed
    private ActorWorld world;
    //Number of Rows and Columns for the board
    private final int ROWS = 8;
    private final int COLS = 8;

    /**
     * Default constructor for objects of class Board
     */
    public Board()
    {
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        //puts black pieces minus pawns
        new BlackKing(1).putSelfInGrid(grid, new Location(0,3));
        new BlackQueen(1).putSelfInGrid(grid, new Location(0,4));
        new BlackBishop(1).putSelfInGrid(grid, new Location(0,2));
        new BlackBishop(1).putSelfInGrid(grid, new Location(0,5));
        new BlackKnight(1).putSelfInGrid(grid, new Location(0,1));
        new BlackKnight(1).putSelfInGrid(grid, new Location(0,6));
        new BlackRook(1).putSelfInGrid(grid, new Location(0,0));
        new BlackRook(1).putSelfInGrid(grid, new Location(0,7));
        // puts white pieces minus pawns
        new King(0).putSelfInGrid(grid, new Location(7,3));
        new Queen(0).putSelfInGrid(grid, new Location(7,4));
        new Bishop(0).putSelfInGrid(grid, new Location(7,2));
        new Bishop(0).putSelfInGrid(grid, new Location(7,5));
        new Knight(0).putSelfInGrid(grid, new Location(7,1));
        new Knight(0).putSelfInGrid(grid, new Location(7,6));
        new Rook(0).putSelfInGrid(grid, new Location(7,0));
        new Rook(0).putSelfInGrid(grid, new Location(7,7));

        //puts in pawns
        for(int i = 0; i< 8; i++){
            new BlackPawn(1).putSelfInGrid(grid, new Location(1,i));
            new Pawn(0).putSelfInGrid(grid, new Location(6,i));
        }
        
        //puts grid in World and runs the chess game from the board
        world = new ActorWorld(grid);
        world.setMessage("Chess");
        world.show();
    }

    public static void main(String[] args)
    {
        //Creates a new Chess board to run the game on
        Board b= new Board();
    }
}
