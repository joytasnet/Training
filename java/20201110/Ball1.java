import java.util.*;
public class Ball1{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean[] isPicked={false,false,false,false,false};
		for(int i=0;i<balls.length;i++){
			while(true){
				int index=new Random().nextInt(balls.length);
				if(isPicked[index]){
					continue;
				}
				System.out.println(balls[index]);
				isPicked[index]=true;
				break;
			}
		}
	}
}
