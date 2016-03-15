import greenfoot.Greenfoot;

/**
 * Write a description of class PLayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends API
{
    /**
     * Act - do whatever the PLayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public static int health = 10;
	public static boolean falling = false;
	public static Items[] Inventory = new Items[12];
	public void act(){
		if(!(Worldground.SolidBlocks.contains(getX()+"_"+(getY()+1)))){	
			if (falling == false){	
				falling = true;
				API.moveEntity(this,"runter",1);
				Greenfoot.delay(30000);
				if((Worldground.SolidBlocks.contains(getX()+"_"+(getY()+1)))){	
					falling = false;
				}
			}else if(falling = true){
			API.moveEntity(this,"runter",1);
			Greenfoot.delay(30000);
			health--;
			}
		}
		
		if(Greenfoot.isKeyDown("a")){
			if(!(Worldground.SolidBlocks.contains((getX()-1)+"_"+getY()))){	
				setImage("images/Player1.png");
				API.moveEntity(this,"links",1);
				Greenfoot.delay(30000);
			}else if(!(Worldground.SolidBlocks.contains((getX()-1)+"_"+(getY()-1)))){				
				setImage("images/Player1.png");
				API.moveEntity(this,"links",1);
				API.moveEntity(this,"hoch",1);
				Greenfoot.delay(30000);
			}
		}
		if(Greenfoot.isKeyDown("d")){
			if(!(Worldground.SolidBlocks.contains((getX()+1)+"_"+getY()))){		
				setImage("images/Player.png");
				API.moveEntity(this,"rechts",1);
				Greenfoot.delay(30000);
			}else if(!(Worldground.SolidBlocks.contains((getX()+1)+"_"+(getY()-1)))){				
				setImage("images/Player.png");
				API.moveEntity(this,"rechts",1);
				API.moveEntity(this,"hoch",1);
				Greenfoot.delay(30000);
			}
		}
	   
   }
}

