package ro.ase.acs.template;

public abstract class PartsMover {
	public void movePart() {
		liftPart();
		transportPart();
		dropPart();
	}
	
	protected abstract void liftPart();
	protected abstract void transportPart();
	protected abstract void dropPart();
}
