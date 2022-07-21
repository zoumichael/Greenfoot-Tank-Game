import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyMissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyMissile extends EnemyProjectile
{       
    /**
     * Constructor for MyMissile that sets the direction and variables
     */
    public EnemyMissile(int direction){
        setRotation(direction);
        counter = 0;
        fizzOut = 40;
        speed = 10;
    }
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        frame++;
        if(frame%4 == 0)
            setImage("missile1.png");
        else if(frame%4 == 2)
            setImage("missile2.png");
        move(speed);
        selfDestruct();
    }    
}
