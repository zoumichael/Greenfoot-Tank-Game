import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A powerful tank that shoots mgun and missiles
 * 
 * @author Michael
 * @version 15/12/2014
 */
public class EnemyGiantTank extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public EnemyGiantTank(){
        
        setImage("HeavyTank.png");
        
        health = 1000;
        speed = 1;
        reloadTime = 50;
        reloadTimeTwo = 5;
        range = 250;
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
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(1000);
                getWorld().removeObject(this);
            }
        }
    }      

    /**
     * Shoots missiles and mgun bullets
     */
    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMissile(getRotation()), getGlobalX(), getGlobalY());;
        }
        counterTwo++;
        if(counterTwo > reloadTimeTwo){
            counterTwo = 0;
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());
        }
    }  
}
