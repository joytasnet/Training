import java.util.*;
public class BingoApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("幅>");
		int width=sc.nextInt();
		System.out.print("最低Bingoライン数>");
		int matchLine=sc.nextInt();
		long total=0;
		while(true){
			total++;
			int[][] card=makeCard(width);
			int count=0;
			count+=horizontalMatchLine(card);
			count+=verticalMatchLine(card);
			count+=crossMatchLine(card);
			if(count >= matchLine){
				showCard(card);
				System.out.println(total+"回");
				break;
			}
		}
	}

	static int[][] makeCard(int width){
		Random rand=new Random();
		int[][] card=new int[width][width];
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				card[i][j]=rand.nextInt(9)+1;
			}
		}
		return card;
	}
	static void showCard(int[][] card){
		for(int[] line:card){
			for(int n:line){
				System.out.print(n);
			}
			System.out.println();
		}
	}
	static boolean isSame(int[] line){
		boolean isSame=true;
		int first=line[0];
		for(int i=1;i<line.length;i++){
			if(first != line[i]){
				isSame=false;
				break;
			}
		}
		return isSame;
	}
	static int horizontalMatchLine(int[][] card){
		return countLine(card);
	}
	static int verticalMatchLine(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card.length;j++){
				lines[i][j]=card[j][i];
			}
		}
		return countLine(lines);
	}
	static int crossMatchLine(int[][] card){
		int[][] lines=new int[2][card.length];
		for(int i=0;i<lines.length;i++){
			for(int j=0;j<card.length;j++){
				if(i==0){
					lines[i][j]=card[j][j];
				}else{
					lines[i][j]=card[j][card.length-1-j];
				}
			}
		}
		return countLine(lines);
	}
	static int countLine(int[][] temp){
		int count=0;
		for(int[] line:temp){
			if(isSame(line)){count++;}
		}
		return count;
	}
}
