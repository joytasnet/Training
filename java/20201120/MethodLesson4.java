import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("整数a>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数b>");
		int b=new Scanner(System.in).nextInt();
		int max=maxOf(a,b);
		System.out.println("大きい方は"+max);

		System.out.println(decorateStr("Hello",2));
		System.out.println(decorateStr("Hello",1));
	}
	static int maxOf(int a,int b){
		return a>b ? a : b;
	}
	static String decorateStr(String str,int num){
		if(true){
			return "***" + str +"***";
		}

	}

	static void methodA(int a){
		if(a < 0 ){
			return;
		}
		System.out.println(a);
	}

}
