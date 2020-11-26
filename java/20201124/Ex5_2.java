public class Ex5_2{
	public static void main(String[] args){
		email("例の件","hoge@gmail.com","例の件です");
		email("hoge@gmail.com","例の件です");
	}
	static void email(String title,String address,String text){
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
	static void email(String address,String text){
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}
}
