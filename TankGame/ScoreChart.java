import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A markers that displays the score 
 * 
 * @author Michael 
 * @version 20/10/2014
 */
public class ScoreChart extends ScrollActor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        drawHealth();
        updateLocation();
    }    
    
    /**
     * Draws a healthbar above the player
     */
    public void drawHealth(){
        //gets player info
        int myHealth = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getHealth();
        
        
        //draws bar
        GreenfootImage image = new GreenfootImage(104, 10);
        image.setColor(Color.BLACK);
        image.fillRect(0, 0, 99, 9); 
        image.setColor(new Color(128, 255, 0));
        image.fillRect(2, 2, myHealth/10 - 5, 5);  
        
        
        setImage(image);  
    }
    
    public void updateLocation(){
        int tankX = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getX();
        int tankY = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getY(); 
        setLocation(tankX, tankY - 60);
    }
}
