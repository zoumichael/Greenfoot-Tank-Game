import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyTankBarrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyTankBarrel extends ScrollActor
{
    //initialize variables
    private int myWeap;
    private int weapCounter;
    private final int WEAP_BOUND = 30;
    private int reloadTime;
    private int counter;
    private boolean mouseIsDown = false;  
    private int sprayAccuracy = 1;

    private int mGunAmmo = 200;
    private int rocketAmmo = 50;
    private int lazerAmmo = 10;

    //constructer that initialize variables
    public MyTankBarrel(){
        myWeap = 0;
        weapCounter = 0;
        reloadTime = 5;
    }

    //act method
    public void act() 
    {
        if(counter >= reloadTime)   
            counter = reloadTime;
        sprayAccuracy -= 2;
        if(sprayAccuracy<1)
            sprayAccuracy = 1;
        weapCounter++;
        counter++;
        changeWeap();
        turnToMouse();
        jumpToBase();
        getCrate();
        shoot();

    }

    //switches weapon and reload time
    public void changeWeap(){
        if(weapCounter > WEAP_BOUND && Greenfoot.isKeyDown("E")){
            myWeap++;
            if(myWeap == 1){
                setImage("MyTankBarrel1.png");
                reloadTime = 50;
                counter = 50;
                weapCounter = 0;
            }
            else if(myWeap == 0 || myWeap == 3){
                setImage("MyTankBarrel2.png");
                myWeap = 0;
                reloadTime = 5;
                counter = 5;
                weapCounter = 0;
            }
            else if(myWeap == 2){
                setImage("MyTankBarrel3.png");
                reloadTime = 20;
                counter = 20;
                weapCounter = 0;
            }

        }
    }

    public void shoot(){
        if(Greenfoot.mousePressed(null))  
            mouseIsDown = true;  
        else if(Greenfoot.mouseClicked(null))  
            mouseIsDown = false;  
        if(mouseIsDown){
            updateSpray();
            if(counter > reloadTime){
                if(myWeap == 0){
                    if(mGunAmmo > 0){
                        getWorld().addObject(new MGunBullet(sprayAccuracy), getGlobalX(), getGlobalY());
                        mGunAmmo--;
                        counter = 0;
                    }
                }
                else if(myWeap == 2){
                    if(rocketAmmo > 0){
                        getWorld().addObject(new MyMissile(), getGlobalX(), getGlobalY());
                        rocketAmmo--;
                        counter = 0;
                    }
                }
                else if(myWeap == 1){
                    if(lazerAmmo > 0){
                        getWorld().addObject(new LazerBeam(), getGlobalX(), getGlobalY());
                        lazerAmmo--;
                        counter = 0;
                    }
                }                
            }
        }
    }

    public void updateSpray(){
        sprayAccuracy += 3;
        if(sprayAccuracy > 50)
            sprayAccuracy = 50;
    }

    //turns to mouse
    public void turnToMouse(){
        MouseInfo mouse = Greenfoot.getMouseInfo();             
        if (mouse != null)      
            turnTowards(mouse.getX(), mouse.getY());   
    }

    //jumps to tank base
    public void jumpToBase(){
        int tankX = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getX();
        int tankY = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getY(); 
        setLocation(tankX, tankY);
    } 

    /**
     * Picks up crates
     */
    public void getCrate(){
        Actor mgun = getOneIntersectingObject(MGunCrate.class);
        if(mgun != null){
            mGunAmmo = 200;
            getWorld().removeObject(mgun);
        }
        
        Actor rocket = getOneIntersectingObject(MissileCrate.class);
        if(rocket != null){
            rocketAmmo = 50;
            getWorld().removeObject(rocket);
        }
        
        Actor laser = getOneIntersectingObject(LaserCrate.class);
        if(laser != null){
            lazerAmmo = 10;
            getWorld().removeObject(laser);
        }
    }
    
    //Accessor Method
    public int getReload(){
        return reloadTime;
    }

    public int getCounter(){
        return counter;
    }

    public int getWeap(){
        return myWeap;
    }
    
    public int getMaxAmmo(){
        if(myWeap == 0)
            return 200;
        else if(myWeap == 1)
            return 10;
        else if(myWeap == 2)
            return 50;
        return 0;
    }
    
    public int getCurrAmmo(){
        if(myWeap == 0)
            return mGunAmmo;
        else if(myWeap == 1)
            return lazerAmmo;
        else if(myWeap == 2)
            return rocketAmmo;
        return 0;
    }
    
    
}
