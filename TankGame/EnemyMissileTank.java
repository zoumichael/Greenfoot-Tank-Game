import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy Tank that shoots missiles
 * 
 * @author Michael 
 * @version 10/10/2014
 */
public class EnemyMissileTank extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public EnemyMissileTank(){
        setImage("EnemyMissileTank.png");
        
        health = 300;
        speed = 1;
        reloadTime = 100;
        range = 400;
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
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(200);
                getWorld().removeObject(this);
            }
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMissile(getRotation()), getGlobalX(), getGlobalY());;
        }
    }
}
