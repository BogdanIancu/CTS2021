package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock {

	private Texture texture = null;
	
	public StoneBlock() {
		try {
			System.out.println("Loading texture...");
			Thread.sleep(3000);
			texture = new Texture("stone");
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
		StoneBlock copy = (StoneBlock)super.clone();
		copy.texture = (Texture) texture.clone();
		return copy;
	}	
}
