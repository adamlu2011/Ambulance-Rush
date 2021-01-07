import greenfoot.*;  
public class Ambulance extends Actor
{
    
    public void act() 
    {
        keyPressed();
        collision();
    }
    
    public void keyPressed()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
    }
    
    private void collision()
    {
        if (isTouching (Car.class))
        {
            Greenfoot.playSound("car_crash.mp3");
            removeTouching (Car.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.gameOver();
            Greenfoot.stop();
        }
        
        if (isTouching (House.class))
        {
            Greenfoot.playSound("woop_woop.mp3");
            removeTouching (House.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.addScore(10);
            myWorld.numberOfHomes = myWorld.numberOfHomes -1;
        }
        
        if (isTouching (Tree.class))
        {
            Greenfoot.playSound("bounce.mp3");
            move(-4);
        }
    }
}
