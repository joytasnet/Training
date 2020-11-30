import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("消費税は何%ですか>");
		int tax=sc.nextInt();
		int price;
		int total=0;
		/*
		do{
			System.out.print("価格を入力(0でお会計)>");
			pirce=sc.nextInt();
			total+=price;
		}while(price != 0);
		*/
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			price=sc.nextInt();
			if(price == 0){
				break;
			}
			total+=price;
		}
		System.out.printf("お買い物合計金額は%d円(税込み)です。%n",calcIncludeTax(total,tax));
	}
	static int calcIncludeTax(int excludeTax,int tax){
		double ratio=1+(tax/100.0);
		return (int)(excludeTax*ratio);
	}
}
