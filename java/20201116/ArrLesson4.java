import java.util.*;
public class ArrLesson4{
	public static void main(String[] args){
		System.out.print("何クラス>");
		int classNum=new Scanner(System.in).nextInt();
		int[][] data=new int[classNum][];
		for(int i=0;i<data.length;i++){
			System.out.print("クラス"+(i+1)+"は何人>");
			int studentNum=new Scanner(System.in).nextInt();
			data[i]=new int[studentNum];
			for(int j=0;j<data[i].length;j++){
				System.out.print(j+1+"人目の点数>");
				int score=new Scanner(System.in).nextInt();
				data[i][j]=score;
			}
		}
		System.out.println("---結果---");
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
	}
}
