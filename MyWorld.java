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
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,156,98);
        Wall wall2 = new Wall();
        addObject(wall2,183,98);
        Wall wall3 = new Wall();
        addObject(wall3,211,98);
        Wall wall4 = new Wall();
        addObject(wall4,238,98);
        Wall wall5 = new Wall();
        addObject(wall5,400,188);
        Wall wall6 = new Wall();
        addObject(wall6,400,215);
        Wall wall7 = new Wall();
        addObject(wall7,400,243);
        Wall wall8 = new Wall();
        addObject(wall8,400,270);
        Wall wall9 = new Wall();
        addObject(wall9,266,98);
        Apple apple = new Apple();
        addObject(apple,90,336);
        Banana banana = new Banana();
        addObject(banana,501,231);
        BigItem bigItem = new BigItem();
        addObject(bigItem,51,51);
        Cherry cherry = new Cherry();
        addObject(cherry,228,155);
        Grape grape = new Grape();
        addObject(grape,325,348);
        SmallItem smallItem = new SmallItem();
        addObject(smallItem,372,107);
        Pacman pacman = new Pacman();
        addObject(pacman,65,231);
    }
}
