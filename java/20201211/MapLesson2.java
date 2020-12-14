import java.util.*;
public class MapLesson2{
	public static void main(String[] args){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=1;i<=6;i++){
			map.put(i,0);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("サイコロを何回ふりますか>");
		int count=sc.nextInt();
		Random rand=new Random();
		for(int i=0;i<count;i++){
			int num=rand.nextInt(6)+1;
			map.put(num,map.get(num)+1);
		}
		System.out.println("***result***");
		for(int key:map.keySet()){
			System.out.printf("%d...%d回%n",key,map.get(key));
		}
		
	}
}
