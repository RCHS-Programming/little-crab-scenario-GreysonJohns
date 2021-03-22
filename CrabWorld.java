import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(750, 750, 1);
        addObject(new Crab(), 325, 325);
        
        addObject(new Lobster(), 450, 100);
        addObject(new Lobster(), 450, 300);
        addObject(new Lobster(), 450, 500);
        addObject(new Lobster(), 450, 700);
        
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
        addObject (new Worm(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(750));
}
}