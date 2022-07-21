import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        BattleButton battlebutton = new BattleButton();
        addObject(battlebutton, 431, 205);
        TankOnlyButton tankonlybutton = new TankOnlyButton();
        addObject(tankonlybutton, 433, 262);
        NoTreeButton notreebutton = new NoTreeButton();
        addObject(notreebutton, 431, 323);
        notreebutton.setLocation(433, 313);
        tankonlybutton.setLocation(432, 257);
        MMButton mmbutton = new MMButton();
        addObject(mmbutton, 149, 320);
    }
}
