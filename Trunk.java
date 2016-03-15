import greenfoot.Greenfoot;

public class Trunk extends API {
	public void act(){

		if(!(Worldground.Stub.contains(getX()+"_"+(getY()+1))||Worldground.Stub.contains(getX()+"_"+(getY()+2)))){
			Worldground.Trunk.remove(getY()+"_"+getY());
			Greenfoot.delay(50000);
			getWorld().removeObject(this);
		}
		
	}
}
