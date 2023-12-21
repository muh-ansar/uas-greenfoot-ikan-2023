import greenfoot.*;

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Animal
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int noOfShroomEaten = 0;
    public void act() 
    {
        move();
        checkKeys();
        eatShroom();
    }
    public void move()
    {
        move(1+noOfShroomEaten);
        if(isAtEdge())
        {
            if (getX() == 0 )
                setLocation(799, getY());
            else if (getX() == 799 )
                setLocation(0, getY());
            else if (getY() == 0 )
                setLocation(getX(), 599);
            else if (getY() == 599 )
                setLocation(getX(),0);
               
        }
    }
    public void checkKeys()
    {
        if( Greenfoot.isKeyDown("a") )
            turn(-5);
        if( Greenfoot.isKeyDown("d") )
            turn(5);
    }
    
    public void eatShroom()
    {
        if( canSee(Plankton.class) )
        {
            eat(Plankton.class);
            noOfShroomEaten++;
            updateScore();
            makanan();
        }
        if ( noOfShroomEaten == 12 )
        {
            World w = getWorld();
            w.addObject(new GameOver(), w.getWidth() / 2, w.getHeight() / 2);
            Greenfoot.stop();
        }
            
    }
    public void makanan()
    {
        Plankton p = new Plankton();
        World w;
        w = getWorld();
        w.addObject(p, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
    }
    public void updateScore()
    {
        World w = getWorld();
        Water water = (Water) w;
        Counter counter = water.getCounter();
        counter.setScore(noOfShroomEaten);
    }
}
