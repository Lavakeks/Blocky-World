import UI.Big_player;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class UI extends Actor {
		
	boolean menushow = false;
	public void act(){
		if(Greenfoot.isKeyDown("e")){
			if(menushow == false){
				GreenfootImage i = new GreenfootImage("images/Player_Menu.png");
				Greenfoot.delay(10000);
				Actor a = new Big_player();
				setImage(i);
				getWorld().addObject(a, getX()+5, getY());
				getWorld().addObject(new HealthCounter(),getX()+2,getY()-3);
				Greenfoot.delay(10000);
				menushow = true;
			}
			
		}else if(Greenfoot.isKeyDown("r")){
			if(menushow == true){
				getImage().clear();
				getWorld().removeObjects(getWorld().getObjects(Big_player.class));
				getWorld().removeObjects(getWorld().getObjects(HealthCounter.class));
				menushow = false;
			}
		}
	}
	
}
