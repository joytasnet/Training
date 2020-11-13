import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		System.out.println(Arrays.toString(nums));
		//拡張forで全部出力
		for(int val : nums){
			System.out.println(val);
		}
		//配列を逆順にする。
		for(int i=0;i<nums.length/2;i++){
			int temp=nums[i];
			nums[i]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(nums));
		//配列をシャッフル
		for(int i=0;i<nums.length-1;i++){
			int index=new Random().nextInt(nums.length-i);
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(nums));
		//配列を昇順に並び替え
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
