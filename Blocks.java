import java.util.ArrayList;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public enum Blocks {
	EARTH(1,0,null,Worldground.Earth),
	GRASS(1,1,null,Worldground.Grass),
	STONE(2,0,null,Worldground.Stone),
	STUB(3,0,null,Worldground.Stub),
	CROWN(3,2,null,Worldground.Crown),
	TRUNK(3,1,null,Worldground.Trunk),
	IRON_ORE(4,0,null,Worldground.Iron_Ore),
	SILICON_ORE(4,1,null,Worldground.Silicon_Ore),
	COPPER_ORE(4,2,null,Worldground.Copper_Ore),
	GOLD_ORE(4,3,null,Worldground.Gold_Ore),
	COAL_ORE(4,4,null,Worldground.Coal_Ore),
	SILBER_ORE(4,5,null,Worldground.Silber_Ore),
	WOOD_PLANKS(6,0,null,Worldground.Wood_Planks),
	WORKING_TABLE(7,0,null,Worldground.Working_Table),
	SAND(8,0,null,Worldground.Sand),
	BRICKS(9,0,null,Worldground.Bricks),
	IRON_BLOCK(10,0,null,Worldground.Iron_Block),
	SILICON_BLOCK(10,1,null,Worldground.Silicon_Block),
	COPPER_BLOCK(10,2,null,Worldground.Copper_Block),
	GOLD_BLOCK(10,3,null,Worldground.Gold_Block),
	COAL_BLOCK(10,4,null,Worldground.Coal_Block),
	SILBER_BLOCK(10,5,null,Worldground.Silber_Block);
	
	
    private final int id;
    private final int secID; 
    private final GreenfootImage image;
    private final ArrayList<String> a;
    Blocks(int id, int secID,GreenfootImage image,ArrayList<String> a) {
        this.id = id;
        this.secID = secID;
        this.image = image;
        this.a = a;
    }
	private int id() { 
		return id; 
		}
	
	private int secID() { 
		return secID; 
	}
		
	private GreenfootImage image(){
		return image;
	}
	
	private ArrayList<String> a(){
		return a;
	}

	int getID(){
		return id();
	}
	
	ArrayList<String> getArray(){
		return a();
	}
	
	GreenfootImage getImage(){
		return image();
	}
	
	Actor getActor(){
		Actor actor = null; 
		if (id() == 1&& secID() == 0){
			actor = new Earth();
		}else if(id() == 1 && secID() == 1){
			actor = new Grass();			
		}else if(id() == 2 && secID() == 0){
			actor = new Stone();
		}else if(id() == 3 && secID() == 0){
			actor = new Stub();
		}else if(id() == 3 && secID() == 1){
			actor = new Trunk();			
		}else if(id() == 3 && secID() == 2){
			actor = new Crown();
		}else if(id() == 4){
			if(secID() == 0){
				actor = new Ore.Iron();
			}else if(secID() == 1){
				actor = new Ore.Silicon();
			}else if(secID() == 2){
				actor = new Ore.Copper();
			}else if(secID() == 4){
				actor = new Ore.Coal();
			}
		}
		return actor;
	}
	
	int getSecID(){
		return secID();
	}




}

