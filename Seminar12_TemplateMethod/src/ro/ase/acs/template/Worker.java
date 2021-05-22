package ro.ase.acs.template;

public class Worker extends PartsMover {

	@Override
	public void liftPart() {
		System.out.println("The part is ready to be lifted");
	}

	@Override
	public void transportPart() {
		System.out.println("It is safe to transport the part");
	}

	@Override
	public void dropPart() {
		System.out.println("You can leave the part here");
	}

}
