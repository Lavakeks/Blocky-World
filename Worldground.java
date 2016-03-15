// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.World;

/**
 * Write a description of class Worldground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldground extends World
{	
	public static ArrayList<String> SolidBlocks = new ArrayList<String>();
	public static ArrayList<String> Trunk = new ArrayList<String>();
	public static ArrayList<String> Stone = new ArrayList<String>();
	public static ArrayList<String> Stub = new ArrayList<String>();
	public static ArrayList<String> Crown = new ArrayList<String>();
	public static ArrayList<String> Earth = new ArrayList<String>();
	public static ArrayList<String> Grass = new ArrayList<String>();
	public static ArrayList<String> Iron_Ore = new ArrayList<String>();
	public static ArrayList<String> Silicon_Ore = new ArrayList<String>();
	public static ArrayList<String> Copper_Ore = new ArrayList<String>();
	public static ArrayList<String> Gold_Ore = new ArrayList<String>();
	public static ArrayList<String> Coal_Ore = new ArrayList<String>();
	public static ArrayList<String> Silber_Ore = new ArrayList<String>();
	public static ArrayList<String> Wood_Planks = new ArrayList<String>();
	public static ArrayList<String> Working_Table = new ArrayList<String>();
	public static ArrayList<String> Sand = new ArrayList<String>();
	public static ArrayList<String> Bricks = new ArrayList<String>();
	public static ArrayList<String> Iron_Block = new ArrayList<String>();
	public static ArrayList<String> Silicon_Block = new ArrayList<String>();
	public static ArrayList<String> Copper_Block = new ArrayList<String>();
	public static ArrayList<String> Gold_Block = new ArrayList<String>();
	public static ArrayList<String> Coal_Block = new ArrayList<String>();
	public static ArrayList<String> Silber_Block = new ArrayList<String>();
	
	public Worldground() 
    {    
    	super(33,18,50); 
        Greenfoot.start();
        Greenfoot.setSpeed(100);
        SolidBlocks.clear();
        Trunk.clear();
        Stone.clear();
        Stub.clear();
        prepare();
        
        
    }
    public static void add(Actor a,int x,int y,World w){
    	w.addObject(a,x,y);
    }
    private void prepare(){
        schicht0();
        schicht1();
        schicht2();
        schicht3();
        schicht4();
        addObject(new Player(),Math.round(getWidth()/2), getHeight()-14);
        addObject(new UI(),Math.round(getWidth()/2), getHeight()-10);
    }
  	private void schicht1() {
  		for(int y = getHeight()-2;y > getHeight()-7;y--){
    		for(int x = getWidth();x > 0;x--){
	    			int z = Greenfoot.getRandomNumber(15);
						if(z == 0){
							API.addblock(Blocks.COAL_ORE, x-1, y-1,this);
						}else if(z == 1){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 2){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 3){
							API.addblock(Blocks.IRON_ORE, x-1, y-1,this);
						}else if(z == 4){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 5){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 6){
							API.addblock(Blocks.COPPER_ORE, x-1, y-1,this);
						}else if(z == 7){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 8){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 9){
							API.addblock(Blocks.SILICON_ORE, x-1, y-1,this);
						}else if(z == 10){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 11){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 12){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 13){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 14){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}else if(z == 15){
							API.addblock(Blocks.STONE, x-1, y-1,this);
						}
            	}
  			}
    	}
	

	private void schicht0(){
        for(int y = getHeight();y > getHeight()-2;y--){
    		for(int x = getWidth();x > 0;x--){
        		addObject(new Korund(),x-1,y-1);
        		addObject(new Korund(), x, y);
        	}
    	}
    }
   
	private void schicht2(){
        for(int y = getHeight()-7;y > getHeight()-11;y--){
    		for(int x = getWidth();x > 0;x--){
    			int z = Greenfoot.getRandomNumber(5);
				if(!((y-1) < getHeight()-10)){
					if(z == 0){
						API.addblock(Blocks.EARTH, x-1, y-1,this);
					}else if(z == 1){
						API.addblock(Blocks.STONE, x-1, y-1,this);
					}else if(z == 2){
						API.addblock(Blocks.EARTH, x-1, y-1,this);
					}else if(z == 3){
						API.addblock(Blocks.STONE, x-1, y-1,this);
					}else if(z == 4){
						API.addblock(Blocks.STONE, x-1, y-1,this);
					}else if(z == 5){
						API.addblock(Blocks.STONE, x-1, y-1,this);
					}
				}else{
					API.addblock(Blocks.EARTH, x-1, y-1,this);
				}
             }
    	}
    }
    private void schicht3(){
        for(int y = getHeight()-11;y > getHeight()-12;y--){
    		for(int x = getWidth();x > 0;x--){
    			API.addblock(Blocks.GRASS,x-1,y-1,this);
    		}
    	}
    }
    private void schicht4() {
    	for(int y = getHeight()-12;y > getHeight()-13;y--){
    		for(int x = getWidth();x > 0;x = x-5){
    			int z = Greenfoot.getRandomNumber(3);
        		if(z == 0 || z == 1){
        			Baum(x-1,y-1);
        		}
        		if (z == 2 || z == 3){
        			Berg(x-1,y-1);
        		}
        	}
    	}
	}
    private void Berg(int x,int y) {
        API.addblock(Blocks.EARTH,x,y,this);
        API.addblock(Blocks.STONE,x,y-1,this);
        API.addblock(Blocks.GRASS,x+1,y,this);
        API.addblock(Blocks.GRASS,x-1,y,this);
        
    }
    private void Baum(int x,int y){
        addObject(new Stub(),x,y);
        addObject(new Trunk(),x,y-1);
        addObject(new Trunk(),x,y-2);
        addObject(new Crown(),x,y-3);

    }

}
