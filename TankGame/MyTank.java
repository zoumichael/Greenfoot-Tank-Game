import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The tank that the player controls
 * 
 * @author Michael
 * @version 10/6/2014
 */
public class MyTank extends ScrollActor
{
    //creates variables
    private int myHealth;
    private int mySpeed;
    private int counter;
    private int reloadTime;
    private int score = 0;

    private static final int MOVE_AMOUNT = 5;

    //constructer that initialize variables
    public MyTank(){
        myHealth = 1000;
        mySpeed = 4;
        counter = 0;
        reloadTime = 32;
    }

    //act method
    public void act() 
    {
        if(myHealth > 0){
            moveAround();
            checkCollisionObject();
            checkCollision();
        }
        else
            Greenfoot.setWorld(new GameOver(score));
    }    

    //moves around
    public void moveAround(){
        if(Greenfoot.isKeyDown("A")){
            setRotation(getRotation() - 3);
            getWorld().setCameraDirection(getRotation());
        }
        if(Greenfoot.isKeyDown("D")){
            setRotation(getRotation() + 3);
            getWorld().setCameraDirection(getRotation());
        }
        if(Greenfoot.isKeyDown("S")){
            // move the camera backwards:
            getWorld().moveCamera(-MOVE_AMOUNT/2);
        }
        else if(Greenfoot.isKeyDown("W")){
            // move the camera forwards:
            getWorld().moveCamera(MOVE_AMOUNT);
        }
    }   

    //checks if collsion with an object
    public void checkCollisionObject(){
        Actor obj = getOneIntersectingObject(Objects.class);                 
        if(obj != null){
            if(Greenfoot.isKeyDown("W"))
                getWorld().moveCamera(-MOVE_AMOUNT);
            else if(Greenfoot.isKeyDown("S"))
                getWorld().moveCamera(MOVE_AMOUNT/2);
        }  
    }

    //returns health so that other classes can use it
    public int getHealth(){
        return myHealth;
    }
    
    //checks if comes into collision with a missile
    public void checkCollision(){
        Actor Em = getOneIntersectingObject(EnemyMissile.class);
        if(Em != null){
            myHealth -= 100;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(Em);
        }
        
        Actor Emr = getOneIntersectingObject(EnemyMiniRocket.class);
        if(Emr != null){
            myHealth -= 10;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(Emr);
        }
        
        Actor MG = getOneIntersectingObject(EnemyMGun.class);
        if(MG != null){
            myHealth --;
            getWorld().removeObject(MG);
        }
        
        Actor C = getOneIntersectingObject(Charger.class);
        if(C != null){
            myHealth -= 50;
            //Greenfoot.playSound("Explosion.mp3");
            getWorld().addObject(new Explosion(), getGlobalX(), getGlobalY());
            getWorld().removeObject(C);
        }
        
        Actor health = getOneIntersectingObject(HealthCrate.class);
        if(health != null){
            myHealth = 1000;
            getWorld().removeObject(health);
        }
        
        Actor S = getOneIntersectingObject(Sabotager.class);
        if(S != null){
            myHealth -= 2;
        }
    }
    
    /**
     * Increments score by a set amount
     */
    public void incrementScore(int buff){
        score += buff;
    }
}
