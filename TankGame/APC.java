import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * The superclass of all enemy APC
 * 
 * @author Michael 
 * @version 10/20/2014
 */
public class APC extends Enemy
{
    protected int maxSpawn;
    protected int spawnCounter = 0;

    //Spawns weak enemies
    public void spawnWeak(){
        if(spawnCounter < maxSpawn){
            Random rand = new Random();
            counter++;
            if(counter > reloadTime){
                int temp = rand.nextInt(2);
                if(temp == 0)
                    getWorld().addObject(new Gunner(), getGlobalX(), getGlobalY());
                else if(temp == 1)
                    getWorld().addObject(new Rocketeer(), getGlobalX(), getGlobalY());
                counter = 0;
                spawnCounter++;
            }
        }
    }
    //Spawns strong enemies
    public void spawnStrong(){
        if(spawnCounter < maxSpawn){
            Random rand = new Random();
            counter++;
            if(counter > reloadTime){
                int temp = rand.nextInt(4);
                if(temp == 0)
                    getWorld().addObject(new Gunner(), getGlobalX(), getGlobalY());
                else if(temp == 1)
                    getWorld().addObject(new Rocketeer(), getGlobalX(), getGlobalY());
                else if(temp == 2)
                    getWorld().addObject(new Charger(), getGlobalX(), getGlobalY());
                else if(temp == 3)
                    getWorld().addObject(new Sabotager(), getGlobalX(), getGlobalY());
                counter = 0;
                spawnCounter++;
            }
        }
    }
}

