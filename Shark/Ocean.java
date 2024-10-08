import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FastFish fastFish = new FastFish();
        addObject(fastFish,139,78);
        Shark shark = new Shark();
        addObject(shark,330,88);
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,216,233);
        slowFish.setLocation(165,198);
        shark.setLocation(70,225);
        slowFish.setLocation(226,201);
        fastFish.setLocation(244,266);
        slowFish.setLocation(364,211);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,433,128);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,460,275);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,324,78);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,341,329);
    }
}
