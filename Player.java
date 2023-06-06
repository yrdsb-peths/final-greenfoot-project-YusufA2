import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b;
    int speed = 5;
    public Player(int r, int g, int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
        
    }
    public void act()
    {
        move(speed);
        if(Greenfoot.isKeyDown("right"))
            setRotation(0);
        if(Greenfoot.isKeyDown("left"))
            setRotation(180);
        if(Greenfoot.isKeyDown("up"))
            setRotation(270);
        if(Greenfoot.isKeyDown("down"))
            setRotation(90);
            
        
        
        // Add your action code here.
        
    }
}
