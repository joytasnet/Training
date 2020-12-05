public abstract class Template{
	String name;
	public Template(String name){
		this.name=name;
	}
	public void intro(){
		System.out.println("はじめまして、"+this.name+"です!");
	}
	public abstract void content();
	public void ending(){
		System.out.println("よろしくおねがいします");
	}
	public final void introduce(){
		intro();
		content();
		ending();
	}
}
