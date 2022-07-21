import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A spawner that creates weak APC
 * 
 * @author Michael
 * @version 10/20/2014
 */
public class WeakAPCSpawner extends EnemySpawner
{
    public WeakAPCSpawner(){
        reloadTime = 7500;
        rampUp = 75000;
    }
    
    /**
     * Act - do whatever the MachineGunSpawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter++;
        rampCounter++;
        if(rampCounter > rampUp && !ramped){
            reloadTime = reloadTime / 2;
            ramped = true;
        }
        if(counter > reloadTime){
            createEnemy();
            counter = 0;
        }
    }    
    
    public void createEnemy(){
        getWorld().addObject(new WeakAPC(), getGlobalX(), getGlobalY());
    }
}
