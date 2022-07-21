import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main menu world
 * 
 * @author Michael
 * @version 12/17/2014
 */
public class UI extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public UI()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.setSpeed(100);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playbutton = new PlayButton();
        addObject(playbutton, 473, 177);
        InstructionsButton instructionsbutton = new InstructionsButton();
        addObject(instructionsbutton, 481, 255);
        instructionsbutton.setLocation(475, 241);
    }
}
