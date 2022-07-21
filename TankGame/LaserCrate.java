import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The crate that the player picks up to gain lazer ammo
 * 
 * @author Michael
 * @version 15/12/2014
 */
public class LaserCrate extends Crates
{
    public LaserCrate(){
        setImage("LazerAmmo.png");
    }
    
    /**
     * Act - do whatever the HealthCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkStack();
    }    
}
