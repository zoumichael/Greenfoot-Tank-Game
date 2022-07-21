import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * The superclass of crates that the player can pick up
 * 
 * @author Michael 
 * @version 15/12/2014
 */
public class Crates extends ScrollActor
{
    /**
     * Checks if the crates is stacked on top of another crate
     */
    public void checkStack(){
        Actor crate = getOneIntersectingObject(Crates.class);
        if(crate != null){
            //jump();
        }
    }

    /**
     * Jumps to a random position on the map
     */
    public void jump(){
        Random rand = new Random();
        int x = rand.nextInt(1900) + 300;
        int y = rand.nextInt(1900) + 300;
        setLocation(x, y);
    }
}
