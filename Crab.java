import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        checkKeyPress();
        move();
        lookForWorm();
    }
     
    public void move( )
    {
        move(5);
    }
    
    /*
     * If crab finds worm, then eat it.
     */
    public void lookForWorm()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * Check if a key is pressed, if so turn a crab.
     */
    public void checkKeyPress()
    {
                if(Greenfoot.isKeyDown("A"))
        {
            turn(-5);
        }
        
                if(Greenfoot.isKeyDown("D"))
        {
            turn(5);
        }
    }
}


