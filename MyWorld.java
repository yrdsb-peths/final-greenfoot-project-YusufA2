import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world that allows the snake to move.
 * 
 * @author (Yusuf) 
 * @version (1.01)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld
     * 
     */
    Player bluePlayer = new Player(0,0,0,255);
    Player greenPlayer = new Player(4,0,255,0);
    Counter blueCounter = new Counter();
    Counter greenCounter = new Counter();
    int count = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(bluePlayer, 500, 400);
        addObject(blueCounter, 650, 50);
        addObject(greenPlayer, 150, 400);
        addObject(greenCounter, 50, 50);
        
    }
    public void act()
    {
        count++;
        if(count >100)
        {
        addObject(new Food(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1));
        count = 0;
        }
    } 
}

