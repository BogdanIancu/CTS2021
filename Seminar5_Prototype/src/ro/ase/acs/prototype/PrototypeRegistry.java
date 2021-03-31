package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
	private static Map<String, BuildingBlock> map = 
			new HashMap<String, BuildingBlock>();
	
	static {
		StoneBlock stoneBlock = new StoneBlock();
		map.put("stone", stoneBlock);
		WoodBlock woodBlock = new WoodBlock();
		map.put("wood", woodBlock);
	}
	
	public static BuildingBlock getBlock(String blockType) {
		try {
			return (BuildingBlock) map.get(blockType).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
