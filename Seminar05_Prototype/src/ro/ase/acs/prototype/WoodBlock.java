package ro.ase.acs.prototype;

public class WoodBlock extends BuildingBlock {
	private Texture texture = null;
	
	public WoodBlock() {
		try {
			System.out.println("Loading texture...");
			Thread.sleep(4000);
			texture = new Texture("wood");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void render() {
		System.out.println(String.format("The %s block was rendered at %d %d %d", 
				texture.getName(), getX(), getY(), getZ()));
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		WoodBlock copy = (WoodBlock)super.clone();
		copy.texture = (Texture) texture.clone();
		return copy;
	}
}
