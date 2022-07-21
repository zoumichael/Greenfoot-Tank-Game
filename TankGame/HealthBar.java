import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a healthbar above the player
 * 
 * @author Michael 
 * @version 10/14/2014
 */
public class HealthBar extends ScrollActor
{ 
    private int buffer = 4;
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
        double myHealth = ((MyTank) getWorld().getObjects(MyTank.class).get(0)).getHealth();
        double currentReload = (double) ((MyTankBarrel) getWorld().getObjects(MyTankBarrel.class).get(0)).getCounter();
        double maxReload = (double) ((MyTankBarrel) getWorld().getObjects(MyTankBarrel.class).get(0)).getReload();
        int currWeap = ((MyTankBarrel) getWorld().getObjects(MyTankBarrel.class).get(0)).getWeap();

        double currAmmo = ((MyTankBarrel) getWorld().getObjects(MyTankBarrel.class).get(0)).getCurrAmmo();
        double maxAmmo = ((MyTankBarrel) getWorld().getObjects(MyTankBarrel.class).get(0)).getMaxAmmo();
        //draws bar
        buffer++;
        if(buffer % 2 == 0){
            GreenfootImage image = new GreenfootImage(601, 68);
            image.setColor(Color.BLACK);
            image.fillRect(72, 42, 601, 60); 
            image.setColor(new Color(128, 255, 0));
            image.fillRect(72, 42, (int) (myHealth/100*39), 59);  
            double length = 0;
            if(currWeap == 0)
                length = (int) (currentReload/maxReload * 79.0);
            else if(currWeap == 1)
                length = (int) (currentReload/maxReload * 94.0);
            else if(currWeap == 2)
                length = (int) (currentReload/maxReload * 91.0);

            //image.setColor(new Color(0, 128, 255));
            //image.fillRect(2, 11, (int) length, 6);  

            double length2 = currAmmo/maxAmmo;
            
            image.setColor(new Color(204, 0, 0));
            image.fillRect(460, 42, (int) (length2*140), 59);  

            setImage(image);  
        }
    }

    /**
     * Updates the location so it is at the bottom of the screen
     */
    public void updateLocation(){
        setLocation(300, 300 + 266);
    }
}
