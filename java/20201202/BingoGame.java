import java.util.*;
public class BingoGame{
	public static void main(String[] args){
		final int WIDTH=7,MAX_NUMBER=75;
		Scanner sc=new Scanner(System.in);
		int[][] card=makeCard(WIDTH,MAX_NUMBER);
		int center=WIDTH/2;
		card[center][center]=0;
		showCard(card);
		int[] balls=createBalls(MAX_NUMBER);
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
		int count=horizontalMatchLine(card)+verticalMatchLine(card)+crossMatchLine(card);
		return 	count;
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
