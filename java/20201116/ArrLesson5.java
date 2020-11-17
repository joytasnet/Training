import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		String[] items={"いつ","誰が","どこで","何をした"};
		String[][] data=new String[items.length][];
		for(int i=0;i<data.length;i++){
			System.out.print(items[i]+"はいくつ>");
			int cont=new Scanner(System.in).nextInt();
			data[i]=new String[cont];
			for(int j=0;j<data[i].length;j++){
				System.out.print(items[i]+"をいれて>");
				String item=new Scanner(System.in).nextLine();
				data[i][j]=item;
			}
		}
		String[] seps={"","が","で",""};
		for(int i=0;i<data.length;i++){
			int index=new Random().nextInt(data[i].length);
			System.out.print(data[i][index]+seps[i]);
		}
		System.out.println();
	}
}
