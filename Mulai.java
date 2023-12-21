import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mulai extends World
{

    /**
     * Constructor for objects of class Mulai.
     * 
     */
    public Mulai()
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
        Tombol tombol = new Tombol();
        addObject(tombol,418,352);
    }
}
