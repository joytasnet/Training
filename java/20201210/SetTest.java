import java.util.*;
public class SetTest{
	public static void main(String[] args){
		String str="赤,青,黄,青,緑,緑,黒,白,青,ピンク,黄緑,白";
		String[] data=str.split(",");
		//listからsetを生成
		//Set<String> set=new HashSet<>(Arrays.asList(data));
		Set<String> set=new HashSet<>();
		for(String s:data){
			set.add(s);
		}
		System.out.println(set.size());
		System.out.println(set.contains("黒") ? "yes":"no");
		//setからlistを生成
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(0));
	}
}
