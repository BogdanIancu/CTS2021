package ro.ase.acs.template;

public class Robot extends PartsMover {

	@Override
	public void liftPart() {
		//...
		System.out.println("The part has been lifted by the robot");
	}

	@Override
	public void transportPart() {
		//...
		System.out.println("The part is being transported by the robot");		
	}

	@Override
	public void dropPart() {
		//...
		System.out.println("Moved successfully by the robot");
	}

}
