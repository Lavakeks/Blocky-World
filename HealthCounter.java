

import java.awt.Color;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;
import greenfoot.GreenfootImage;
 
/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthCounter extends Actor
{
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    	String s = String.valueOf(Player.health);
        setImage(new GreenfootImage(s, 24, Color.BLACK,new Color(207,207,207)));
		
    }  
}