import java.awt.Color;

import greenfoot.Greenfoot;

public class Text extends API {

	public Text(String s,int x,int y,Color c) {
		getImage().clear();
		getImage().setColor(c);
		getImage().drawString(s, x, y);
	}
	public Text(String s,int x,int y,Color c,int delay) {
		getImage().clear();
		getImage().setColor(c);
		getImage().drawString(s, x, y);
		Greenfoot.delay(delay);
		getImage().clear();
		getWorld().removeObject(this);
	}
	
	
	
	
}
