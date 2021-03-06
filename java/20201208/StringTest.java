public class StringTest{
	public static void main(String[] args){
		String s1="スッキリJava";
		String s2="Java";
		String s3="java";
		if(s2.equals(s3)){
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは"+s1.length()+"です");
		if(s1.isEmpty()){
			System.out.println("s1は空文字です");
		}

		String s4="Java and JavaScript";
		if(s4.contains("Java")){
			System.out.println("文字列s4はJavaを含んでいます");
		}
		if(s4.endsWith("Java")){
			System.out.println("文字列s4はJavaが末尾にあります");
		}
		if(s4.startsWith("Java")){
			System.out.println("文字列s4はJavaが先頭にあります");
		}
		System.out.println("文字列s4で最初にJavaが登場する位置は"+s4.indexOf("Java"));
		System.out.println("文字列s4で最後にJavaが登場する位置は"+s4.lastIndexOf("Java"));
		
		String s5="Java programming";
		System.out.println("文字列s5の4文字目以降は"+s5.substring(3));
		System.out.println("文字列s5の4~8文字目は"+s5.substring(3,8));

		System.out.println("s5を全部小文字にすると"+s5.toLowerCase());
		System.out.println("s5を全部大文字にすると"+s5.toUpperCase());
		
		String s6=" Java lesson  ";
		System.out.println("s6の前後の空白を除去すると"+s6.trim());
		System.out.println("s6のlessonをtutorialに変更すると"+s6.replace("lesson","tutorial"));
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<100;i++){
			sb.append("Java");
		}
		System.out.println(sb);

	}
}
