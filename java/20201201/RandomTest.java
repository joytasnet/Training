import java.util.*;
public class RandomTest{
	public static void main(String[] args){
		for(int i=0;i<3;i++){
			Random rand=new Random(1);
			System.out.println(rand.nextInt(100));
		}
	}
}
