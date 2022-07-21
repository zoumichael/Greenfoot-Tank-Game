import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy tank that is fast but weak
 * 
 * @author Michael
 * @version 14/10/2014
 */
public class MachineGunTank extends Enemy
{
    /**
     * The constructer for the enemy set variables
     */
    public MachineGunTank(){
        
        setImage("EnemyMGunTank.png");
        
        health = 200;
        speed = 3;
        reloadTime = 5;
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
                ((MyTank) getWorld().getObjects(MyTank.class).get(0)).incrementScore(100);
                getWorld().removeObject(this);
            }
        }
    }      

    private void shoot(){
        counter++;
        if(counter > reloadTime){
            counter = 0;
            getWorld().addObject(new EnemyMGun(getRotation()), getGlobalX(), getGlobalY());
        }
    }
}
