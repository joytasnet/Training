import java.util.*;
public class ArrLesson2{
	public static void main(String[] args){
		int[][] data1={
			{15,34,12},
			{21,3,4,12},
			{12,34},
		};
		System.out.println(data1[1][2]);//4
		int[][] data2=new int[3][];
		data2[0]=new int[]{15,34,12};
		data2[1]=new int[]{21,3,4,12};
		data2[2]=new int[]{12,34};
		System.out.println(data2[2][1]);//34
		int[][] data3=new int[3][];
		data3[0]=new int[3];
		data3[0][0]=15;
		data3[0][1]=34;
		data3[0][2]=12;
		data3[1]=new int[4];
		data3[2]=new int[2];
	}
}
