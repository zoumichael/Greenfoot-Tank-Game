import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * The superclass of all enemies
 * 
 * @author Michael
 * @version 10/10/2014
 */
public class Enemy extends ScrollActor
{
    //variables shared by all enemies
    protected int health;
    protected int speed;
    protected int counter = 0;
    protected int counterTwo = 0;
    protected int reloadTime;
    protected int reloadTimeTwo;
    protected int range;
    protected int buffer = 0;

    /**
     * A method that allows the object to turn towards the player, or MyTank.class
     */
    protected void turnTowardsTank(){
        int tankX = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getX();
        int tankY = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getY(); 
        buffer++;
        if(buffer%10 == 0)
            turnTowards(tankX, tankY);
    }

    /**
     * A method that calculates whether this tank is in range of the Player
     */
    protected void moveForward(){
        int tankX = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getX();
        int tankY = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getY(); 
        int distance = distanceCalc(tankX, tankY);
        if(distance > range)
            move(speed);
    }

    /**
     * A method that calculates the distance between the coordinates enter and the object
     */
    protected int distanceCalc(int x, int y){
        double squareDistance = Math.pow((x- getX()), 2) + Math.pow((y- getY()), 2);
        double finalDistance = Math.sqrt(squareDistance);
        return (int) finalDistance;
    }

    /**
     * Makes room so that the enemies aren't stacked
     */
    protected void makeRoom(){
        Random rand = new Random();
        Actor Enemy = getOneIntersectingObject(Enemy.class);
        if(Enemy != null){        
            int test = rand.nextInt(4);
            if(test == 0){
                turn(-2);
                move(-4*speed);                
            }
            else if(test == 1){
                turn(2);
                move(-4*speed);
            }
            else if(test == 2){
                turn(-2);
                move(4*speed);
            }
            else if(test == 3){
                turn(2);
                move(4*speed);
            }
        }
    }

    /**
     * Checks collision, takes damage and removes the object if the health is too low
     */
    public void checkCollision(){
        //Triggers creating objects
        Actor missile = getOneIntersectingObject(MyMissile.class);
        if(missile != null){
            getWorld().removeObject(missile);
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new MyBigExplosion(), getGlobalX(), getGlobalY());
            //if(health < 1)
            //    getWorld().removeObject(this);
        }

        if(health > 0){
            Actor explosion = getOneIntersectingObject(MyBigExplosion.class);
            if(explosion != null){
                health -= 5;
                //if(health < 1)
                //     getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor cBomb = getOneIntersectingObject(ChainBomb.class);
            if(cBomb != null){
                health -= 50;                
                //getWorld().removeObject(cBomb);
                //if(health < 1)
                //    getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor mBullet = getOneIntersectingObject(MGunBullet.class);
            if(mBullet != null){
                health -= 3;                
                //getWorld().removeObject(cBomb);
                //if(health < 1)
                //    getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor lBeam = getOneIntersectingObject(LazerBeam.class);
            if(lBeam != null){
                health -= 15;                
                //getWorld().removeObject(cBomb);
                //if(health < 1)
                //    getWorld().removeObject(this);
            }
        }
    }
    
    /**
     * Returns true if the health is less than 1 and false otherwise
     */
    public boolean checkDead(){
        if(health < 1)
            return true;
        return false;
    }

    public void humanCheckCollision(){
        //Triggers creating objects
        if(health > 0){
            Actor explosion = getOneIntersectingObject(MyBigExplosion.class);
            if(explosion != null){
                health -= 5;
                if(health < 1)
                    getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor cBomb = getOneIntersectingObject(ChainBomb.class);
            if(cBomb != null){
                health -= 50;                
                //getWorld().removeObject(cBomb);
                if(health < 1)
                    getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor mBullet = getOneIntersectingObject(MGunBullet.class);
            if(mBullet != null){
                health -= 3;                
                //getWorld().removeObject(cBomb);
                if(health < 1)
                    getWorld().removeObject(this);
            }
        }
        
        if(health > 0){
            Actor lBeam = getOneIntersectingObject(LazerBeam.class);
            if(lBeam != null){
                health -= 15;                
                //getWorld().removeObject(cBomb);
                if(health < 1)
                    getWorld().removeObject(this);
            }
        }
    }
}
