import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Label that displays the score
 * 
 * @author Michael
 * @version 21/12/2014
 */
public class ImageLabel extends Actor
{
    /**
     * Constructor for ImageLabel
     */
    public ImageLabel(int score){
        // create the text image
        int fontsize = 40; // change as desired
        Color fontColor = Color.BLACK; // change as desired
        Color bgColor = new Color(0, 0, 0, 0); // transparent background
        GreenfootImage txtImg = new GreenfootImage("Your Score is: " + score, fontsize, Color.BLACK, bgColor);
        // create the base image
        GreenfootImage img = new GreenfootImage(300, 50);
        bgColor = Color.YELLOW; // change as desired
        img.setColor(bgColor);
        img.fill();
        // draw text image on base image
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
}
