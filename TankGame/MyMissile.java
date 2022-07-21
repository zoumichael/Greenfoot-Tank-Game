import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The missile that the player shoots
 * 
 * @author Michael
 * @version 10/6/2014
 */
public class MyMissile extends MyProjectile
{
    /**
     * Constructor for MyMissile that sets the direction and variables
     */
    public MyMissile(){      
        counter = 0;
        fizzOut = 40;
        speed = 10;
    }
    
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(!lockOn){
            turnTowardsMouse();
            lockOn = true;
        }
        frame++;
        if(frame%4 == 0)
            setImage("missile1.png");
        else if(frame%4 == 2)
            setImage("missile2.png");
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
