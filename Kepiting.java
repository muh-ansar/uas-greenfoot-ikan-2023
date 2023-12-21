import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kepiting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kepiting extends Actor
{
    /**
     * Act - do whatever the Kepiting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
{
setLocation(getX() - 2, getY());
if (getX() <= 0)
{
setLocation(getWorld().getWidth() +getX() , getY());
}
    }
}
