import java.util.*;
public class Main{
	public static void main(String[] args){
		Animal[] animals=new Animal[3];
		//Animal[] animals={new Dog("john"),new Cat("mike"),new Pig("sam")};
		animals[0]=new Dog("ジョン");
		animals[1]=new Cat("ミケ");
		animals[2]=new Pig("サム");
		for(Animal animal:animals){
			animal.makeNoize();
				((Cat)animal).sleep();
		}
		/*
		Cat mike =(Cat)animals[1];
		mike.sleep();
		((Cat)animals[1]).sleep();
		*/
	}
}
