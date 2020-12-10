import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int n=sc.nextInt();
			if(n == 0){
				break;
			}
			list.add(n);
			System.out.println(n+"をListに追加したよ!");
		}
		System.out.println("---結果---");
		System.out.println("要素数:"+list.size());
		System.out.print("要素:");
		for(int n:list){
			System.out.print(n+",");
		}
		System.out.println();

	}
}
