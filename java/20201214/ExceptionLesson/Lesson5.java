import java.util.*;
public class Lesson5{
	public static void main(String[] args){
		int[] arr={10,20,30,40};
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("index(q:終了)>");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("q")){
				System.out.println("終了");
				return;
			}
			try{
				int index=Integer.parseInt(str);
				System.out.println(arr[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error:数値は0~"+(arr.length-1));
			}catch(NumberFormatException e){
				System.out.println("error:1,2...のような数値で入力");
			}
		}
	}
}
