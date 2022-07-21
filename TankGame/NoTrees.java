import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class NoTrees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoTrees extends ScrollWorld
{

    /**
     * Constructor for objects of class NoTrees.
     * 
     */
    public NoTrees()
    {    
        super(600, 600, 1, 2500, 2500);
        Greenfoot.setSpeed(50);
        setPaintOrder(Hud.class, HealthBar.class, BorderForest.class, TreeTop.class, LazerBeam.class, MyMissile.class, ChainBomb.class, Explosion.class, MyTankBarrel.class, Sabotager.class, MyTank.class);
        int numTrees = 0;
        
        addObject(new BorderForest(), 1250, 1250);
        
        addObject(new CrateSpawner(), 0, 0);
        
        addObject(new HealthBar(), 0, 0);
        addObject(new Hud(), 0, 0);
        addObject(new MyTankBarrel(), 0, 0);
        
        //adds machine gun spawners
        addObject(new MachineGunSpawner(), 1250, 0);
        addObject(new MachineGunSpawner(), 1250, 2500);
        addObject(new MachineGunSpawner(), 2500, 1250);
        addObject(new MachineGunSpawner(), 0, 1250);
        
        //adds missile spawner
        addObject(new MissileSpawner(), 0, 0);
        addObject(new MissileSpawner(), 2500, 2500);
        
        //adds giant spawners
        addObject(new GiantSpawner(), 2500, 0);
        addObject(new GiantSpawner(), 0, 2500);
        
        //adds APC spawners
        addObject(new WeakAPCSpawner(), 500, 0);
        addObject(new WeakAPCSpawner(), 2000, 2500);
        
        addObject(new StrongAPCSpawner(), 0, 2000);
        addObject(new StrongAPCSpawner(), 2500, 500);
        
        
        
        //adds trees;
        Random rand = new Random();
        for(int i = 0; i<numTrees; i++){
            int randX = rand.nextInt(1900) + 300; 
            int randY = rand.nextInt(1900) + 300; 
            addObject(new TreeTruck(), randX, randY);
            addObject(new TreeTop(), randX, randY);
        }
      
        addCameraFollower(new MyTank(), 0, 0);
    }
}
