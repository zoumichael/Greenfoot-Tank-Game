import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * A crate that the player picks up to restore health
 * 
 * @author Michael
 * @version 15/12/2014
 */
public class HealthCrate extends Crates
{
    public HealthCrate(){
        setImage("Health.png");
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
