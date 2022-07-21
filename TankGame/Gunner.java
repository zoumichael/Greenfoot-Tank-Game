import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy infantry that shoots a machine gun
 * 
 * @author Michael 
 * @version 10/20/2014
 */
public class Gunner extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public Gunner(){
        
        setImage("MachineGunner.png");
        
        health = 30;
        speed = 3;
        reloadTime = 3;
        range = 100;
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
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());;
        }
    }  
}
