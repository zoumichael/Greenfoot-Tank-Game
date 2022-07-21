import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An object thtat spawns missile tanks
 * 
 * @author Michael 
 * @version 10/15/2014
 */
public class MissileSpawner extends EnemySpawner
{
    public MissileSpawner(){
        reloadTime = 2000;
        rampUp = 20000;
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
        getWorld().addObject(new EnemyMissileTank(), getGlobalX(), getGlobalY());
    }
}
