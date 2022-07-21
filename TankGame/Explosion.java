import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An explosion
 * 
 * @author Michael
 * @version 10/15/2014
 */
public class Explosion extends ScrollActor
{
    private int frame = 0;
    private int aminCount = 0;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        aminCount++;
        if(aminCount % 2 == 0)
            updateFrame();
    }    

    private void updateFrame(){
        if(frame == 0){
            frame++;
            setImage("Explosion1.png");
        }
        else if(frame == 1){
            frame++;
            setImage("Explosion2.png");
        }
        else if(frame == 2){
            frame++;
            setImage("Explosion3.png");
        }
        else if(frame == 3){
            frame++;
            setImage("Explosion4.png");
        }
        else if(frame == 4){
            frame++;
            setImage("Explosion5.png");
        }
        else if(frame == 5){
            frame++;
            setImage("Explosion6.png");
        }
        else if(frame == 6){
            frame++;
            setImage("Explosion7.png");
        }
        else if(frame == 7){
            frame++;
            setImage("Explosion8.png");
        }
        else if(frame == 8){
            frame++;
            setImage("Explosion9.png");
        }
        else if(frame == 9){
            frame++;
            setImage("Explosion10.png");
        }
        else if(frame == 10){
            frame++;
            setImage("Explosion11.png");
        }
        else if(frame == 11){
            frame++;
            setImage("Explosion12.png");
        }
        else if(frame == 12){
            frame++;
            setImage("Explosion13.png");
        }
        else if(frame == 13){
            getWorld().removeObject(this);
        }
    }
}
