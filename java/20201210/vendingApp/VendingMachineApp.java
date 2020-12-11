import java.util.*;
public class VendingMachineApp{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		Wallet wallet=new Wallet(1000);
		VendingMachine vm=new VendingMachine(3);
		while(true){
			System.out.print("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4.商品投入 / 5.所持金表示 / 6.終了>");
			int select =sc.nextInt();
			switch(select){
				case 1:
					System.out.print("投入する金額を入力して下さい >");
					int money=sc.nextInt();
					money=wallet.takeOutMoney(money);
					vm.insertCoins(money);
					break;
				case 2:
					money=vm.purchase();	
					if(money != -1){
						wallet.insertMoney(money);
					}
					break;
				case 3:
					money=vm.cancel();
					wallet.insertMoney(money);
					break;
				case 4:
					System.out.print("投入する個数を入力してください>");
					int num=sc.nextInt();
					vm.insertGoods(num);
					break;
				case 5:
					wallet.display();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
class Wallet{
	private int money;
	public Wallet(int money){
		this.money=money>0 ? money:0;
	}
	public void insertMoney(int money){
		this.money+=money;
		System.out.println("財布に"+money+"円入れました。");
	}
	public int takeOutMoney(int money){
		int m=this.money>money ? money:this.money;
		this.money -= m;
		System.out.println("財布から"+m+"円取り出しました。");
		return m;
	}
	public void display(){
		System.out.println("現在の財布の中身:"+this.money+"円");
	}
}

class VendingMachine{
	public static int PRICE=100;
	private int money;
	private int num;
	public VendingMachine(int num){
		this.num=num>0? num:0;
		insertCoins(0);
	}
	public void insertCoins(int money){
		this.money+=money;
		display();
	}
	public void display(){
		System.out.println("現在の入金額:"+this.money+"円");
	}
	public int cancel(){
		int m=this.money;
		this.money=0;
		display();
		return m;
	}
	public int purchase(){
		if(this.num == 0){
			System.out.println("商品売切れ");
			return -1;
		}
		if(this.money < PRICE){
			System.out.println("投入金額が足りません");
			return -1;
		}
		this.money -= PRICE;
		this.num--;
		return cancel();

	}
	public void insertGoods(int num){
		this.num+=num;
		System.out.println("商品を"+num+"個補充しました");
	}
}
