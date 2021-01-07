import greenfoot.*;
public class MyWorld extends World
{
    private int time;
    int score;
    int numberOfHomes;
    
    public MyWorld()
    {    
        super(600, 400, 1);
        score = 0;
        numberOfHomes =0;
        showScore();
        carsAndTrees();
        
    }
    
    public void act()
    {
        spawnHome();
        youWin();
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
    }
    
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
        showText("!!AMBULANCE RUSH!!", 300, 25);
        showText("House = 10pts :: 200pts to WIN", 300, 45);
    }
    
    public void gameOver()
    {
        showText("GAME OVER", 300, 200);
        showText("Final Score: " +  score, 300, 225);
    }
    
    public void spawnHome()
    {
        if ( numberOfHomes <= 5)
        {
            addObject(new House(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            numberOfHomes = numberOfHomes + 1;
        }
    }
    
    private void youWin()
    {
        if (score >= 200)
        {
            Greenfoot.stop();
            showText("YOU WIN!", 300, 200);
            showText("Final Score: " +  score, 300, 225);
        }
    }
    
    private void carsAndTrees()
    {
        addObject(new Ambulance(), 300, 200);
        addObject(new Car(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Car(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Car(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        addObject(new Tree(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
}
