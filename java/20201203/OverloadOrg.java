import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] arr1=createRandomArr(1,9,3);
		showArr(arr1);
		System.out.println();
		int[][] arr2=createRandomArr(1,9,4,3);
		showArr(arr2);
		System.out.println();
		int[][][] arr3=createRandomArr(1,9,2,3,2);
		showArr(arr3);
	}
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(max-min+1)+min;
		}
		return arr;
	}
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen);
		}
		return arr;
	}
	static int[][][] createRandomArr(int min,int max,int len,int childLen,int gChildLen){
		int[][][] arr=new int[len][childLen][gChildLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen,gChildLen);
		}
		return arr;
	}
	static void showArr(int[] arr){
		System.out.print('{');
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");	
		}
		System.out.print("}");
	}
	static void showArr(int[][] arr){
		System.out.println('{');
		for(int i=0;i<arr.length;i++){
			System.out.print(" ");
			showArr(arr[i]);
			System.out.println(",");
		}
		System.out.print("}");
	}
	static void showArr(int[][][] arr){
		System.out.println("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(" ");
			showArr(arr[i]);
			System.out.println(",");
		}
		System.out.print("}");
	}
}

