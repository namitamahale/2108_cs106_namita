import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ground ground = new ground();
        addObject(ground,30,420);
        ground.setLocation(144,464);
        ground ground2 = new ground();
        addObject(ground2,499,332);
        ground ground3 = new ground();
        addObject(ground3,354,191);
        ground ground4 = new ground();
        addObject(ground4,63,76);
        ground ground5 = new ground();
        addObject(ground5,988,76);
        player player = new player();
        addObject(player,42,426);
        player.setLocation(56,431);
        ground.setLocation(50,466);
        ground3.setLocation(449,138);
        ground3.setLocation(321,163);
        ground2.setLocation(491,337);
        ground2.setLocation(367,339);
        Cloud cloud = new Cloud();
        addObject(cloud,389,36);
        ground4.setLocation(657,204);
        ground4.setLocation(645,225);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,121,100);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,626,100);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,835,62);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,61,32);
        cloud2.setLocation(239,100);
        ground ground6 = new ground();
        addObject(ground6,738,333);
        ground ground7 = new ground();
        addObject(ground7,115,260);
        ground5.setLocation(828,27);
        ground5.setLocation(851,149);
        cloud4.setLocation(839,36);
        ground ground8 = new ground();
        addObject(ground8,610,457);
    }
}
