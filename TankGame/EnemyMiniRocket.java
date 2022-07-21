import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The rocket that the rocketeer shoots.
 * 
 * @author Michael
 * @version 18/10/2014
 */
public class EnemyMiniRocket extends EnemyProjectile
{
    /**
     * Constructor for MyMissile that sets the direction and variables
     */
    public EnemyMiniRocket(int direction){
        setRotation(direction);
        counter = 0;
        fizzOut = 20;
        speed = 10;
    }
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        frame++;
        if(frame%4 == 0)
            setImage("MiniMissile1.png");
        else if(frame%4 == 2)
            setImage("MiniMissile2.png");
        move(speed);
        selfDestruct();
    }    
}
