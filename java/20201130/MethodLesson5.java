import java.util.*;
public class MethodLesson5{
	public static void main(String[] args){
		midashiMaker(20,"すごい!!");
		System.out.println("すごいことがありました。");
		midashiMaker(30,"大事件発生しました！");
		System.out.println("大変なことが起こりました");
		midashiMakerAround("Hello");
		Scanner sc=new Scanner(System.in);
		System.out.print("一文字いれてください>");
		String s=sc.next();
		System.out.print("幅をいれてください>");
		int w=sc.nextInt();
		printSquare(s.charAt(0),w);
	}
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print('*');
		}
		System.out.println();
	}
	static void midashiMaker(int width,String title){
		printLine(width);
		System.out.println('*'+title);
		printLine(width);
	}
	static void midashiMakerAround(String title){
		printLine(title.length()+2);
		System.out.println('*'+title+'*');
		printLine(title.length()+2);
	}
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
}
