import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The crate that the player gets to restore mGun ammo
 * 
 * @author Michael
 * @version 15/12/2014
 */
public class MGunCrate extends Crates
{
    public MGunCrate(){
        setImage("MGunAmmo.png");
    }
    
    /**
     * Act - do whatever the MGunCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkStack();
    }     
}
