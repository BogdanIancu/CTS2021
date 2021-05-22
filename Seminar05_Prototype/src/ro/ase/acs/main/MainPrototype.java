package ro.ase.acs.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.StoneBlock;
import ro.ase.acs.prototype.WoodBlock;

public class MainPrototype {
	public static void main(String[] args) {
		List<BuildingBlock> blocks = new ArrayList<BuildingBlock>();
		
		BuildingBlock b1 = new StoneBlock();
		b1.setX(0);
		b1.setY(0);
		b1.setZ(0);
		
		//BuildingBlock b2 = new StoneBlock();
		BuildingBlock b2 = null;
		try {
			b2 = (BuildingBlock) b1.clone();
			b2.setX(1);
			b2.setY(0);
			b2.setZ(0);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//BuildingBlock b3 = new StoneBlock();
		BuildingBlock b3 = null;
		try {
			b3 = (BuildingBlock) b1.clone();
			b3.setX(2);
			b3.setY(0);
			b3.setZ(0);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		BuildingBlock b4 = new WoodBlock();
		b4.setX(0);
		b4.setY(0);
		b4.setZ(1);
		
		//BuildingBlock b5 = new WoodBlock();
		BuildingBlock b5 = null;
		try {
			b5 = (BuildingBlock) b4.clone();
			b5.setX(1);
			b5.setY(0);
			b5.setZ(1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		blocks.add(b1);
		blocks.add(b2);
		blocks.add(b3);
		blocks.add(b4);
		blocks.add(b5);
		
		for(BuildingBlock block : blocks) {
			block.render();
		}
	}
}
