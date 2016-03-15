import greenfoot.Greenfoot;

public class Stub extends API {
  public void act(){
    int x = getX();
    int y = getY();
    if (!Worldground.Stub.contains(x+"_"+y)){
            Worldground.Stub.add(x+"_"+y);
            }
    if(API.abbauen("Baumstumpf2.png","Baumstumpf3.png", 100000,this,null,Greenfoot.getMouseInfo())){
      Worldground.Stub.remove(x+"_"+y); 
    }
  }
}
