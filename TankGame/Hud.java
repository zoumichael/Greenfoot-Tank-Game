import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A decorative Hud
 * 
 * @author Michael
 * @version 12/15/2014
 */
public class Hud extends ScrollActor
{
    /**
     * Act - do whatever the Hud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("HUD.png");
        setLocation(300, 300 + 266);
    }   
}
