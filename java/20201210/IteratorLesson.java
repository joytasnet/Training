import java.util.*;
public class IteratorLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<String>();
		names.add("ミナト");
		names.add("朝霞");
		names.add("菅原");
		
		for(String s:names){
			System.out.println(s);
			if(s.equals("朝霞")){
				names.remove("朝霞");
			}
		}

		Iterator<String> it=names.iterator();
		while(it.hasNext()){
			String e=it.next();
			System.out.println(e);
			if(e.equals("朝霞")){
				it.remove();
			}
		}
		printList(names);
	}
	public static void printList(List<String> list){
		for(String s:list){
			System.out.println(s);
		}
	}
}
