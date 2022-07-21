import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The superclass of all Objects that spawns enemies
 * 
 * @author Michael
 * @version 10/15/2014
 */
public class EnemySpawner extends ScrollActor
{
    protected int counter = 0;
    protected int reloadTime;
    protected int rampUp;
    protected int rampCounter = 0;
    protected boolean ramped = false;
}
