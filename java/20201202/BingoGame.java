import java.util.*;
public class BingoGame{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		final int[] centerIndex={2,2};
		int[][] card=makeCard(5,99);

		card[centerIndex[0]][centerIndex[1]]=0;
		showCard(card);
		int[] balls=createBalls(99);
		for(int i=0;;i++){
			sc.nextLine();
			int bingoCount=drawBallCountLine(card,balls[i]);
			System.out.printf("%d!(%d回目)",balls[i],i+1);
			if(bingoCount>0){
				System.out.print(":BINGO!");
			}
			System.out.println();
			showCard(card);
			if(bingoCount>0){
				return;
			}
		}
	}
	static int[] makeNums(int max){
		int[] nums=new int[max];
		for(int i=0;i<max;i++){
			nums[i]=i+1;
		}
		return nums;
	}
	static int[][] makeCard(int width,int max){
		int[] nums=makeNums(max);
		arrShuffle(nums);
		int[][] card=new int[width][width];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				card[i][j]=nums[i*width+j];
			}
		}
		return card;
	}
	static void arrShuffle(int[] nums){
		Random rand=new Random();
		for(int i=0;i<nums.length-1;i++){
			int index=rand.nextInt(nums.length-i);
			int temp=nums[index];
			nums[index]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
	}
	static void showCard(int[][] card){
		for(int[] line:card){
			for(int n:line){
				String s=n==0? "@@":String.valueOf(n);
				System.out.printf("%3s",String.valueOf(s));
			}
			System.out.println();
		}
	}
	static int[] createBalls(int max){
		int[] balls=makeNums(max);
		arrShuffle(balls);
		return balls;
	}
	static int drawBallCountLine(int[][] card,int num){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				if(card[i][j]==num){
					card[i][j]=0;
				}
			}
		}
		int bingoLine=countBingoLine(card);
		return 	countBingoLine(card);
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
	static int[][] horizontalLines(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	static int[][] verticalLines(int[][] card){
		int[][] lines=new int[card.length][card.length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[j][i];
			}
		}
		return lines;
	}
	static int[][] crossLines(int[][] card){
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
		return lines;
	}
	static int countBingoLine(int[][] card){
		int count=0;
		int[][] h=horizontalLines(card);
		int[][] v=verticalLines(card);
		int[][] c=crossLines(card);
		int[][] lines=mergeThreeLines(h,v,c);
		for(int[] line:lines){
			if(isSame(line)){
				count++;
			}
		}
		return count;
	}
	static int[][] mergeThreeLines(int[][] h,int[][] v,int[][] c){
		int[][] lines=new int[h.length+v.length+c.length][h[0].length];
		for(int i=0;i<lines.length;i++){
			int[] line;
			if(i<h.length){
				line=h[i];
			}else if(i<h.length+v.length){
				line=v[i-h.length];
			}else{
				line=c[i-h.length-v.length];
			}
			lines[i]=line;
		}
		return lines;
	}
}
