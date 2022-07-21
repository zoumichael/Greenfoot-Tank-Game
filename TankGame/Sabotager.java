import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy Infantry that rushes the player and deals damage over time
 * 
 * @author Michael
 * @version 10/20/2014
 */
public class Sabotager extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public Sabotager(){
        
        setImage("Sabotager.png");
        
        health = 10;
        speed = 4;
        range = 35;
    }

    /**
     * Act - do whatever the EnemyMissileTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            humanCheckCollision();
        }
    }       
}
