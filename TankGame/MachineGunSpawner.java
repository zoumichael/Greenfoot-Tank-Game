import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The object that spawns machine gun enemies
 * 
 * @author Michael 
 * @version 10/15/2014
 */
public class MachineGunSpawner extends EnemySpawner
{
    public MachineGunSpawner(){
        reloadTime = 1000;
        rampUp = 10000;
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
        getWorld().addObject(new MachineGunTank(), getGlobalX(), getGlobalY());
    }
}
