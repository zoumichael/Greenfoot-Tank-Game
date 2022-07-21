import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that spawns soldiers
 * 
 * @author Michael
 * @version 10/20/2014
 */
public class WeakAPC extends APC
{
    /**
     * The constructer for the enemy set variables
     */
    public WeakAPC(){
        setImage("APC.png");
        
        health = 300;
        speed = 1;
        reloadTime = 350;
        range = 800;
        maxSpawn = 20;
    }

    /**
     * Act - do whatever the EnemyMissileTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            spawnWeak();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(200);
                getWorld().removeObject(this);
            }
        }
    }        
}
