import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("おさるの名前を決めてください>");
		Scanner sc=new Scanner(System.in);
		String name = sc.next();
		System.out.print("おさるの歳を決めてください>");
		int age=sc.nextInt();
		Monkey monkey=new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					monkey.greet();
					break;
				case 2:
					monkey.takeuma();
					break;
				case 3:
					monkey.sakadachi();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
