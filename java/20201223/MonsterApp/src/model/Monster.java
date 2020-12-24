package model;

public abstract class Monster {
	private String name;
	public Monster(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public abstract String run();
}
