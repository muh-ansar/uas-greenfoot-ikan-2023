import greenfoot.*;

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animal
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkEdge();
        move();
        randomTurn();
        eatFish();
    }
    public void move()
    {
        move(2);
    }
    public void randomTurn()
    {
        if( Greenfoot.getRandomNumber(80) < 30 )
            turn( Greenfoot.getRandomNumber(90) - 30 );    
    }
    public void checkEdge()
    {
        if( isAtEdge() )
        {
            turn(5);
        }
    }
     /** ini termasuk enkapsulasi */
    protected void eatFish()
    {
        if( canSee(Fish.class) )
        {
            eat(Fish.class);
            World w = getWorld();
            w.addObject(new GameOver(), w.getWidth() / 2, w.getHeight() / 2);
            Greenfoot.stop();
        }
    }

}
  
