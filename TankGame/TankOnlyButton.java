import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Button that the player clicks to go to the tank only battlefield
 * 
 * @author Michael
 * @version 12/18/2014
 */
public class TankOnlyButton extends Actor
{
    /**
     * Act - do whatever the TankOnlyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
             Greenfoot.setWorld(new TankOnly());
    }    
}
