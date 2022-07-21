import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * An enemy machine gun projectile
 * 
 * @author Michael 
 * @version 14/10/2014
 */
public class EnemyMGun extends EnemyProjectile
{
    public EnemyMGun(int direction){
        counter = 0;
        fizzOut = 15;
        lockOn = false;
        speed = 15;
        setRotation(direction);
    }

    public void act() 
    {        
        if(!lockOn){          
            lockOn = true;
            //turn to the left or right randomly
            Random rand = new Random();
            int randomNum = rand.nextInt((5 + 5) + 1) -5;
            turn(randomNum);
        }        
        //move forward
        move(speed);
        selfDestruct();
    }   
}
