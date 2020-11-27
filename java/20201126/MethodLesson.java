import java.util.*;
import my.util.*;
public class MethodLesson{
	public static void main(String[] args){
		final int MIN=-10,MAX=10;
		System.out.print("配列の要素数を入力してください>");
		int count=new Scanner(System.in).nextInt();
		int[] orgArr=Common.arrRandomRange(MIN,MAX,count);
		System.out.println(Arrays.toString(orgArr));
		int[] tempArr=Common.arrClone(orgArr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int select=new Scanner(System.in).nextInt();
			switch(select){
				case 1:
					System.out.println(Arrays.toString(orgArr));
					break;
				case 2:
					Common.arrSort(tempArr);
					System.out.println(Arrays.toString(tempArr));
					break;
				case 3:
					Common.arrSort(tempArr,true);
					System.out.println(Arrays.toString(tempArr));
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
