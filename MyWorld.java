import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Hero hero = new Hero();
        addObject(hero,50,100);
        showText("DODGE IT", 300, 20);
        Banana banana = new Banana();
        addObject(banana, 700, 100);
    }
}
