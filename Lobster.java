import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Greyson Johns
 * @version 3/16 Version 1
 */
public class Lobster extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move();
        lookForCrab();
    }
     
    public void move( )
    {
        move(5);
    }
    
    /*
     * If crab finds crab, then eat it.
     */
    public void lookForCrab()
    {
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /*
     * Make the lobster randomly turn left or right.
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
     * Has the lobster turn at the world edge.
     */
    public void turnAtEdge()
    {
    if(isAtEdge() )
    {
        turn(17);
    }
    }
}
