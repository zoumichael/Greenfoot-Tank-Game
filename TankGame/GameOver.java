import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Default constructor for Gameover, not used
     */
    public GameOver(){super(600, 400, 1); }
    
    /**
     * Constructor for objects of class GameOver
     */
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.setSpeed(100);
        prepare(score);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare(int amount)
    {
        MMButton mmbutton = new MMButton();
        addObject(mmbutton, 300, 350);
        addObject(new ImageLabel(amount), 300, 200);
    }
}
