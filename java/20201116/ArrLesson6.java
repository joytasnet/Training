import java.util.*;
public class ArrLesson6{
	public static void main(String[] args){
		System.out.println("---掛け算表---");
		System.out.print("n(1~9)>");
		int n=new Scanner(System.in).nextInt();
		int[][] data=new int[n][9];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				data[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%2d",data[i][j]);
				if(j != data[i].length-1){
					System.out.print("|");
				}
			}
			System.out.println();
		}

	}
}
