import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Button that the player clikcs to return to the main menu
 * 
 * @author Michael
 * @version 17/12/2014
 */
public class MMButton extends Actor
{
    /**
     * Act - do whatever the MMButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
             Greenfoot.setWorld(new UI());
    }    
}
