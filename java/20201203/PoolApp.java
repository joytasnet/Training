import java.util.*;
public class PoolApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Pool pool=new Pool();
		while(true){
			System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了>");
			int select=sc.nextInt();
			switch(select){
			case 1:
				while(true){
					System.out.print("給水する水量を入力して下さい >");
					double water=sc.nextDouble();
					if(water >0){
						pool.feedWater(water);
						break;
					}
					System.out.println("[給水量は正の値をいれてください。]");
				}
				break;
			case 2:
				while(true){
					System.out.print("排水する水量を入力して下さい >");
					double water=sc.nextDouble();
					if(water >0){
						pool.drainWater(water);
						break;
					}
					System.out.println("[排水量は正の値をいれてください。]");
				}
				break;
			case 3:
				pool.display();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
class Pool{
	final double MAX_WATER=600d;
	double water;

	public Pool(){
		this.water=0d;
	}
	public void feedWater(double water){
		if(this.water==MAX_WATER){
			System.out.println("満水です。");
			return;
		}
		double w=Math.min(water,MAX_WATER-this.water);
		System.out.printf("%.1f立方メートル給水しました。%n",w);
		this.water+=w;
	}
	public void drainWater(double water){
		if(this.water==0){
			System.out.println("水が入っていません。");
			return;
		}
		double w=Math.min(this.water,water);
		System.out.printf("%.1f立方メートル排水しました。%n",w);
		this.water -=w;

	}
	public void display(){
		System.out.printf("現在の水量は%.1f立方メートルです。%n",this.water);
	}
}
