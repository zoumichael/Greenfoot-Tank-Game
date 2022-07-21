import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MGunBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MGunBullet extends MyProjectile
{
    private int accuracy;
    
    public MGunBullet(int acute){
        counter = 0;
        fizzOut = 40;
        speed = 10;
        accuracy = acute;
    }
    /**
     * Act - do whatever the MGunBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!lockOn){
            turnTowardsMouse();
            Random rand = new Random();
            turn(rand.nextInt(accuracy) - accuracy/2); 
            lockOn = true;
        }
        move(speed);
        selfDestruct();
    }    
    
    /**
     * SelfDestruct automatically destroys the projectile after counter exceeds fizzOut
     */
    public void selfDestruct(){
        counter++;
        Actor obj = getOneIntersectingObject(Objects.class);    
        if(counter > fizzOut || obj != null){
            getWorld().removeObject(this);
        }
    }
    
    //turn towards mouse
    public void turnTowardsMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();             
        if (mouse != null)      
           turnTowards(mouse.getX(), mouse.getY());   
    }  
}
