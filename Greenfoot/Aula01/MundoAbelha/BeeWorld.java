import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeeWorld.
 * 
 * @author (Nickolas) 
 * @version (2025-06-04)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,37,175);
        Mosca mosca = new Mosca();
        addObject(mosca,556,27);
        mosca.setLocation(562,63);
        mosca.setLocation(557,178);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,557,178);
        mosca.setLocation(569,41);
        mosca.setLocation(556,159);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,556,159);
        mosca.setLocation(39,340);
        mosca.setLocation(373,333);
        mosca.setLocation(138,82);
        mosca.setLocation(378,226);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,378,226);
        mosca.setLocation(191,94);
        mosca.setLocation(543,348);
        mosca.setLocation(351,227);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,351,227);
        mosca.setLocation(499,316);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,499,316);
        Aranha aranha = new Aranha();
        addObject(aranha,26,33);
        mosca5.setLocation(51,524);
        mosca4.setLocation(312,331);
        mosca.setLocation(720,520);
        mosca2.setLocation(736,84);
        mosca2.setLocation(323,66);
        mosca.setLocation(612,291);
        mosca4.setLocation(407,471);
        mosca.setLocation(430,272);
    }
}
