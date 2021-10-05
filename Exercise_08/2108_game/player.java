import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight= -20;
    
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        
        
    }
    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(4); 
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4); 
        }
        if(Greenfoot.isKeyDown("space")&&(onground()==true))
        {
            vSpeed = jumpHeight;
            fall();
        }
    }
    boolean onground() 
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, ground.class);
        return under !=null;
        
    }
    public void checkFalling()
    {
        if (onground()== false)
        {
            fall();
        }
        if (onground()== true)
        {
            vSpeed = 0;
        }
    }
    
}
