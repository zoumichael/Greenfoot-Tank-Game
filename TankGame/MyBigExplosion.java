import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bigger BigExplosion
 * 
 * @author Michael
 * @version 09/12/201
 */
public class MyBigExplosion extends ScrollActor
{
    private int frame = 0;
    private int aminCount = 0;
    /**
     * Act - do whatever the BigExplosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        aminCount++;
        if(aminCount % 2 == 0)
            updateFrame();
    }    

    /**
     * Animates the explosion
     */
    private void updateFrame(){
        if(frame == 0){
            frame++;
            setImage("BigExplosion1.png");
        }
        else if(frame == 1){
            frame++;
            setImage("BigExplosion2.png");
        }
        else if(frame == 2){
            frame++;
            setImage("BigExplosion3.png");
        }
        else if(frame == 3){
            frame++;
            setImage("BigExplosion4.png");
        }
        else if(frame == 4){
            frame++;
            setImage("BigExplosion5.png");
        }
        else if(frame == 5){
            frame++;
            setImage("BigExplosion6.png");
        }
        else if(frame == 6){
            frame++;
            setImage("BigExplosion7.png");
        }
        else if(frame == 7){
            frame++;
            setImage("BigExplosion8.png");
        }
        else if(frame == 8){
            frame++;
            setImage("BigExplosion9.png");
        }
        else if(frame == 9){
            frame++;
            setImage("BigExplosion10.png");
        }
        else if(frame == 10){
            frame++;
            setImage("BigExplosion11.png");
        }
        else if(frame == 11){
            frame++;
            setImage("BigExplosion12.png");
        }
        else if(frame == 12){
            frame++;
            setImage("BigExplosion13.png");
        }
        else if(frame == 13){
            getWorld().removeObject(this);
        }
    }
}
