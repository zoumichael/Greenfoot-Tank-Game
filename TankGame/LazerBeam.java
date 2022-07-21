import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lazer beam that the 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LazerBeam extends MyProjectile
{
    private int frame = 0;
    private int aminCount = 0;

    /**
     * Act - do whatever the LazerBeam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnToMouse();
        jumpToBase();
        aminCount++;
        if(aminCount % 2 == 0)
            updateFrame();

    }    

    private void updateFrame(){
        if(frame == 0){
            frame++;
            setImage("LazerBeam1.png");
        }
        else if(frame == 1){
            frame++;
            setImage("LazerBeam2.png");
        }
        else if(frame == 2){
            frame++;
            setImage("LazerBeam3.png");
        }
        else if(frame == 3){
            frame++;
            setImage("LazerBeam4.png");
        }
        else if(frame == 4){
            frame++;
            setImage("LazerBeam5.png");
        }
        else if(frame == 5){
            frame++;
            setImage("LazerBeam6.png");
        }
        else if(frame == 6){
            frame++;
            setImage("LazerBeam7.png");
        }
        else if(frame == 7){
            frame++;
            setImage("LazerBeam8.png");
        }
        else if(frame == 8){
            frame++;
            setImage("LazerBeam9.png");
        }
        else if(frame == 9){
            getWorld().removeObject(this);
        }
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
}
