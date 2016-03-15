import java.awt.Color;
import java.util.ArrayList;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.MouseInfo;
import greenfoot.World;

/**
 * Das ist die API-Klasse die andere Klassen hilft
 * 
 * @author CatPro 
 * @version β_0.0.1
 */
public class API extends Actor
{
	public final static void WriteText(boolean b,String s,int x,int y,Color c,World w){
		while(!b){
			w.addObject(new Text(s,x,y,c,1), x, y);
		}
	}
	
	public final static void WriteText(String s,int x,int y,Color c,World w){
		w.addObject(new Text(s,x,y,c), x, y);
	}
	
	public final static void WriteText(String s,int x,int y,Color c,int delay,World w){
		w.addObject(new Text(s,x,y,c,delay), x, y);
	}
	
    public final static void moveEntity(Actor a,String s,int i){
        if (s == "links"){
          a.setLocation(a.getX()-i,a.getY());
        }else  if(s == "rechts"){
            a.setLocation(a.getX()+i,a.getY());
        }else if (s == "hoch"){
        	a.setLocation(a.getX(),a.getY()-i);
        }else  if (s == "runter"){
        	a.setLocation(a.getX(),a.getY()+i);
        }else{  
           System.out.println("ERROR 100");
        }
    } 
    public final static void explode(Actor actor){
        int x = actor.getX();
        int y = actor.getY();
        World w = actor.getWorld();
        w.removeObject(actor);
        w.showText("BUM", x, y);
    }

         
    public final static boolean abbauen(String im1,String im2,int delay,Actor a,ArrayList<Actor>actor2,MouseInfo mouse){
            Boolean b2 = false;
    		if(mouse!=null){
            if (mouse.getButton() == 1 && Greenfoot.mousePressed(a)){
                 Greenfoot.delay(delay);
                 if(Greenfoot.mousePressed(a)) {
                    a.setImage(im1);//hier Bild einfügen
                }
                 Greenfoot.delay(delay);
                 if(Greenfoot.mousePressed(a)) {
                    a.setImage(im2);//hier Bild einfügen
                }
                 Greenfoot.delay(delay);
                 if(Greenfoot.mousePressed(a)) {
                    int y = a.getY();
                    int x =a.getX();
                    a.getWorld().removeObject(a);
                    if(actor2 != null){
                    drops(actor2, x, y,a.getWorld());
                    }
                }
                b2 = true;
            }else{
            	b2 = false;
            }
        }
    		return b2;
    }
    public final static void drops(ArrayList<Actor> l,int x , int y,World w){
    	for (Actor string : l) {
			w.addObject(string, x, y);
		}    	
    }
    public final static void addblock(Blocks b,int x,int y,World w){
    		w.addObject(b.getActor(),x,y);
    		String array = x+"_"+y;
    		b.getArray().add(array);    		
            Worldground.SolidBlocks.add(array);    	
    }
    public final static void removeblock(Actor a,Blocks b,World w){
    	w.removeObject(a);
    	int x = a.getX();
    	int y = a.getY();
    	b.getArray().remove(x+"_"+y);
    }
    public final static void CheckSolidBlocks(int x , int y){
        if (!Worldground.SolidBlocks.contains(x+"_"+y)){
            Worldground.SolidBlocks.add(x+"_"+y);
            } 
    }
}
