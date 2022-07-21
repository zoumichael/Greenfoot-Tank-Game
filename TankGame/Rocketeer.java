import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketeer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocketeer extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public Rocketeer(){
        
        setImage("Rocketeer.png");
        
        health = 30;
        speed = 3;
        reloadTime = 200;
        range = 300;
    }

    /**
     * Act - do whatever the EnemyMissileTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            shoot();
            makeRoom();
            humanCheckCollision();
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMiniRocket(getRotation()), getGlobalX(), getGlobalY());;
        }
    }  
}
