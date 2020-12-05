public abstract class Assets{
	String name;
	int price;
	public Assets(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
}
