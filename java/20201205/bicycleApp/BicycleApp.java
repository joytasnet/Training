import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bicycle[] bikes={new Bicycle(27),new ElectricBicycle(24,10)};
		Bicycle bike=null;
		while(true){
			System.out.println("自転車を選んでください");
			for(int i=0;i<bikes.length+1;i++){
				System.out.print(i+"・・・");
				if(i<bikes.length){
					System.out.println(bikes[i].showStatus());
				}else{
					System.out.println("終了");
				}
			}
	
			int select=sc.nextInt();
			if(select >= 2){
				System.out.println("アプリケーションを終了します");
				return;
			}
			bike=bikes[select];	
outer:
			while(true){
				System.out.print("1/走る,2/降りる"+(bike instanceof ElectricBicycle ? ",3/充電":"") +">");
				select=sc.nextInt();
				switch(select){
					case 1:
						bike.ride();
						break;
					case 2:
						bike.rideOff();
						break outer;
					case 3:
						if(bike instanceof ElectricBicycle){
							((ElectricBicycle)bike).batteryCharge();
						}
						break ;
				}
			}
		}
		
	}
}
class Bicycle{
	int wheelSize;
	public Bicycle(int wheelSize){
		this.wheelSize=wheelSize;
	}
	public void ride(){
		System.out.println("風を切って走ります");
	}
	public void rideOff(){
		System.out.println("自転車を降りました");
	}
	public String showStatus(){
		return "自転車/ホイールサイズ:"+this.wheelSize;
	}
}
class ElectricBicycle extends Bicycle{
	final int MAX=10;
	int battery;
	public ElectricBicycle(int wheelSize,int battery){
		super(wheelSize);
		this.battery=battery< MAX ? battery:MAX;
	}
	public void batteryCharge(){
		System.out.println("バッテリーを充電しました。");
		this.battery=MAX;
	}
	@Override
	public void ride(){
		super.ride();
		battery -=5;
		System.out.println(this.battery>0 ? "坂道だってらくらくです。":"バッテリーが切れるととても重いです");
	}
	@Override
	public String showStatus(){
		return "電動" + super.showStatus() + " バッテリー:" +this.battery;
	}
}

