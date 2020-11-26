public class Code5_13{
	public static void incArray(int[] array){
		int[] temp=new int[array.length];
		for(int i=0;i<temp.length;i++){
			temp[i]=array[i];
		}
		for(int i=0;i<array.length;i++){
			array[i]++;
		}
	}
	public static void incNum(int n){
		n++;
		System.out.println(n);
	}
	public static void main(String[] args){
		int[] array={1,2,3};
		incArray(array);
		for(int i:array){
			System.out.println(i);
		}
		int n=10;
		incNum(n);
		System.out.println(n);
	}
}
