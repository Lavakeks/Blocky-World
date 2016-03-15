import greenfoot.Greenfoot;

public class Crown extends API {
	public void act(){
		if(!Worldground.Stub.contains(getX()+"_"+(getY()+3))){
			Worldground.Crown.remove(getY()+"_"+getY());
			Greenfoot.delay(10000);
			getWorld().removeObject(this);
		}
	}
}
