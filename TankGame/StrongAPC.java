import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that spawns soldiers
 * 
 * @author Michael
 * @version 10/20/2014
 */
public class StrongAPC extends APC
{
    /**
     * The constructer for the enemy set variables
     */
    public StrongAPC(){
        setImage("APC.png");
        
        health = 300;
        speed = 1;
        reloadTime = 350;
        range = 800;
        maxSpawn = 40;
    }

    /**
     * Act - do whatever the EnemyMissileTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(health>0){
            turnTowardsTank();
            moveForward();
            spawnStrong();
            makeRoom();
            checkCollision();
            if(checkDead()){
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(500);
                getWorld().removeObject(this);
            }
        }
    }     
}
