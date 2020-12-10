import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Slime> list=new ArrayList<>();
		while(true){
			System.out.print("スライムを追加する(1...yes,2...no):");
			int select=sc.nextInt();
			if(select==2){
				break;
			}
			System.out.print("追加するスライムの名前を決めてね:");
			String name=sc.next();
			Slime slime=new Slime(name);
			slime.appear();
			list.add(slime);
		}
		for(Slime slime:list){
			slime.attack();
		}
	}
}
class Slime{
	String name;
	Slime(String name){
		this.name=name;
	}
	void appear(){
		System.out.println(this.name+"が現れた!!");
	}
	void attack(){
		System.out.printf("%sの攻撃:5ポイントのダメージを与えた!%n",this.name);
	}
}
