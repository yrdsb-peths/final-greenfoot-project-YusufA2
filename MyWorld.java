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
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(bluePlayer, 450, 300);
        addObject(blueCounter, 550, 50);
        addObject(greenPlayer, 150, 200);
        addObject(greenCounter, 50, 50);
        
    }
    
    
}
