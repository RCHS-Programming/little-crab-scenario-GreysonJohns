import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
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
        }
    }
    
    /*
     * Make the crab randomly turn left or right.
     * Between 0 and 45 degrees.
     */
    public void randomTurn()
    {   
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91)-45 );
        }
    }
    
    /*
     * Has the crab turn at the world edge.
     */
    public void turnAtEdge()
    {
    if(isAtEdge() )
    {
        turn(17);
    }
    }
}


