import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class Image extends API {

	public Image(GreenfootImage i,int x,int y) {
		getImage().clear();
		getImage().drawImage(i, x, y);
	}
	public Image(GreenfootImage image,int x,int y,int delay) {
		getImage().clear();
		getImage().drawImage(image, x, y);
		Greenfoot.delay(delay);
		getImage().clear();
		getWorld().removeObject(this);
	}
	public Image(Boolean b,GreenfootImage image,int x,int y){
		while(!b){
			getImage().clear();
			getImage().drawImage(image, x, y);
			Greenfoot.delay(1);
			getImage().clear();
		}
		getWorld().removeObject(this);
	}
	
	
	
	
}
