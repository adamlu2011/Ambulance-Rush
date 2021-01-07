import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        zoomin();
    }
    
    public void zoomin()
    {
        move(Greenfoot.getRandomNumber(4));
        int turnTimer;
        turnTimer = Greenfoot.getRandomNumber(201);
        
        if (turnTimer < 20)
        {
            turn(10);
        }
        
        if (turnTimer > 180)
        {
            turn(-10);
        }
        
        if ( isAtEdge())
        {
            turn (180);
        }
    }
}
