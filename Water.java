import greenfoot.*;

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends World
{

    /**
     * Constructor for objects of class Water.
     * 
     */
    Counter counter = new Counter();
    public GreenfootSound bgmusic;
    
    
    public Water()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        bgmusic = new GreenfootSound("sounds/Memento.mp3");
        bgmusic.play();
        
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        Fish fish = new Fish();
        addObject(fish, 217, 156);
        fish.setLocation(177, 141);
        fish.setLocation(170, 151);
        Plankton plankton = new Plankton();
        addObject(plankton, 421, 150);
        Plankton plankton2 = new Plankton();
        addObject(plankton2, 307, 305);
        Plankton plankton3 = new Plankton();
        addObject(plankton3, 129, 261);
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 317, 68);
        Dolphin dolphin2 = new Dolphin();
        addObject(dolphin2, 181, 319);
        dolphin2.setLocation(92, 244);
        plankton3.setLocation(174, 267);
        plankton2.setLocation(422, 309);
        Plankton plankton4 = new Plankton();
        addObject(plankton4, 106, 91);
        Plankton plankton5 = new Plankton();
        addObject(plankton5, 342, 361);
        plankton2.setLocation(524, 343);
        plankton.setLocation(468, 102);
        plankton3.setLocation(141, 291);
        fish.setLocation(267, 182);
        dolphin2.setLocation(99, 205);
        fish.setLocation(291, 210);
        plankton4.setLocation(122, 57);
        plankton5.setLocation(330, 502);
        plankton2.setLocation(675, 441);
        plankton3.setLocation(77, 451);
        plankton.setLocation(603, 129);
        dolphin2.setLocation(136, 325);
        fish.setLocation(396, 280);
        Dolphin dolphin3 = new Dolphin();
        addObject(dolphin3, 520, 434);
        plankton4.setLocation(148, 117);

        addObject(counter, 58, 41);
        counter.setLocation(59, 22);
        Gelembung gelembung = new Gelembung();
        addObject(gelembung,662,180);
        Gelembung gelembung2 = new Gelembung();
        addObject(gelembung2,601,508);
        Gelembung gelembung3 = new Gelembung();
        addObject(gelembung3,119,519);
        Gelembung gelembung4 = new Gelembung();
        addObject(gelembung4,76,162);
        Gelembung gelembung5 = new Gelembung();
        addObject(gelembung5,682,30);
        Gelembung gelembung6 = new Gelembung();
        addObject(gelembung6,386,43);
        dolphin3.setLocation(589,409);
        Gelembung gelembung7 = new Gelembung();
        addObject(gelembung7,589,409);
        Gelembung gelembung8 = new Gelembung();
        addObject(gelembung8,385,317);
        Gelembung gelembung9 = new Gelembung();
        addObject(gelembung9,77,388);
        Kepiting kepiting = new Kepiting();
        addObject(kepiting,740,553);
        Kepiting kepiting2 = new Kepiting();
        addObject(kepiting2,530,486);
        Kepiting kepiting3 = new Kepiting();
        addObject(kepiting3,474,552);
        Kepiting kepiting4 = new Kepiting();
        addObject(kepiting4,253,470);
        Kepiting kepiting5 = new Kepiting();
        addObject(kepiting5,156,554);
        dolphin2.setLocation(181,316);
        removeObject(dolphin2);
        plankton2.setLocation(595,410);
        gelembung8.setLocation(657,347);
        gelembung8.setLocation(225,315);
        gelembung8.setLocation(365,335);
        kepiting2.setLocation(493,503);
        kepiting2.setLocation(536,497);
        kepiting2.setLocation(483,480);
        kepiting2.setLocation(538,500);
        removeObject(kepiting3);
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
      
}
