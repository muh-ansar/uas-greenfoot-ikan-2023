import greenfoot.*;
import java.awt.*;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int skor = 0;
    public Counter()
    {
        setImage(new GreenfootImage("Skor: " + skor,28,greenfoot.Color.GREEN,greenfoot.Color.BLUE));
    }
    public void act()
    {
        setImage(new GreenfootImage("Skor: " + skor,28,greenfoot.Color.GREEN,greenfoot.Color.BLUE));
    }
    public void setScore(int s)
    {
     skor = s;
    }
   


}
