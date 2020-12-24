package model;

public class DeathBat extends Monster {

	public DeathBat(String name) {
		super(name);
	}

	@Override
	public String run() {
		return this.getName()+"はバサバサと逃げ出した";
	}

}
