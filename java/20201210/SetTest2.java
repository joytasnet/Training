import java.util.*;
public class SetTest2{
	public static void main(String[] args){
		String[] strArray = new String[]{
				"emhjopwxaz",
				"ykxfjihxvv",
				"oqsuoeojku",
				"stvzdzdplo",
				"ftrmgkauna",
				"ackzqxlchf",
				"dqttpisosm",
				"kfcrgfxenb",
				"vwappsvdld",
				"gvovlddccr",
				"ybaoyevbsl",
				"thhujdjaqk",
				"luxrfzmlyz",
				"zpewohxhvc",
				"whcddsgogv",
				"hzyjmgrbxw",
				"mjmxnxawrw",
				"hdndjktido",
				"vymqiltdzq"
		};
		Set<String> set=new TreeSet<>(Arrays.asList(strArray));
		//System.out.println(set);	
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(list.size()-1));
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			if(s.startsWith("m")){
				it.remove();
			}
		}

		System.out.println(list);
	}
}
