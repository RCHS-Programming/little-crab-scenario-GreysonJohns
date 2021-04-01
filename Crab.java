import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    private int wormsEaten;
    /*
     * Create a Crab and initialize the animation images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage (image1);
        
        wormsEaten = 0;
    }
    
    public void act()
    {
        checkKeyPress();
        move();
        lookForWorm();
        switchImage();
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
            
            wormsEaten++;
            
            getWorld().showText ("Score:" + wormsEaten, 50, 500);
            
            if(wormsEaten == 20)
            {
                Greenfoot.playSound("fanfare.wav");  
                Greenfoot.stop();
            }
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
    
    /*
     * Animates crab. Switches images.
     */
    public void switchImage()
    {
        if(getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
}


