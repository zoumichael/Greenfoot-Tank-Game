import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemyInfantry that rushes the player and explodes
 * 
 * @author Michael  
 * @version 10/20/2014
 */
public class Charger extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public Charger(){
        setImage("Charger.png");
        
        health = 20;
        speed = 5;
        range = 0;
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
