package model;

public class Slime extends Monster {

	public Slime(String name) {
		super(name);
	}

	@Override
	public String run() {
		return this.getName()+"はさささっと逃げ出した";
	}

}
