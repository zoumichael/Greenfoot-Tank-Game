import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Superclass of all enemy projectiles contains variables
 * 
 * @author Michael
 * @version 14/10/2014
 */
public class EnemyProjectile extends ScrollActor
{
    //creates variables
    protected int fizzOut;
    protected int counter;
    protected int speed;
    protected int frame;
    protected boolean lockOn;

    protected void selfDestruct(){
        //check if fizzed out
        Actor obj = getOneIntersectingObject(Objects.class); 
        counter++;
        if(counter > fizzOut || obj != null)
            getWorld().removeObject(this);
    }
}
