package ro.ase.acs.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.prototype.BuildingBlock;
import ro.ase.acs.prototype.PrototypeRegistry;

public class MainPrototypeRegistry {
	public static void main(String[] args) {
		List<BuildingBlock> blocks = new ArrayList<BuildingBlock>();
		
		BuildingBlock b1 = PrototypeRegistry.getBlock("stone");
		b1.setX(0);
		b1.setY(0);
		b1.setZ(0);
		
		BuildingBlock b2 = PrototypeRegistry.getBlock("stone");
		b2.setX(1);
		b2.setY(0);
		b2.setZ(0);
		
		BuildingBlock b3 = PrototypeRegistry.getBlock("stone");
		b3.setX(2);
		b3.setY(0);
		b3.setZ(0);
				
		BuildingBlock b4 = PrototypeRegistry.getBlock("wood");
		b4.setX(0);
		b4.setY(0);
		b4.setZ(1);
		
		BuildingBlock b5 = PrototypeRegistry.getBlock("wood");
		b5.setX(1);
		b5.setY(0);
		b5.setZ(1);
			
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
