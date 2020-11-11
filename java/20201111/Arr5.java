import java.util.*;
public class Arr5{
	public static void main(String[] args){
		char[] chars=new char[]{'H','E','L','L','O'};
		/*
		for(int i=chars.length-1;i>=0;i--){
			System.out.print(chars[i]);
		}
		*/
		for(int i=0;i<chars.length/2;i++){
			char temp=chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i]=temp;
				
		}
		System.out.println(Arrays.toString(chars));
	}
}
