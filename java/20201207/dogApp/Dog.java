public class Dog{
	public static int count=0;
	private int id;
	private String name;
	private int age;
	private double weight;
	public Dog(String name){
		this.setName(name);
		count++;
		this.setId(count);
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,int age,double weight){
		this(name,age);
		this.setWeight(weight);
	}
	public void agePlus(){
		this.setAge(this.getAge()+1);
	}
	public void bow(){
		System.out.println(this.name+"は吠えた");
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			this.age=0;
		}else{
			this.age=age;
		}
	}
	public void setWeight(double weight){
		if(weight < 500d){
			throw new IllegalArgumentException("体重はgで管理されますのでその値は不正です");
		}
		this.weight=weight;
	}
}
