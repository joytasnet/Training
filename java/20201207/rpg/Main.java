import java.util.*;
public class Main{
	public static void main(String[] args){
		/*
		Hero h=new Hero("ロト",100);
		Wizard w=new Wizard();
		w.setName("ジ");
		w.setMp(100);
		w.setHp(100);
		Wand wand=new Wand();
		wand.setName("さとりの杖");
		wand.setPower(50d);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h.getName()+"のHPは"+h.getHp());
		*/
		//System.out.println(Hero.money);
		Hero.showMoney();
		Hero h=new Hero("ロト");
		h.setHp(100);
		Hero h1=new Hero("ジェシカ");
		h1.setHp(100);
		h.attack();
		h1.attack();
		Hero.showMoney();
		//h1.showMoney();
		System.out.println(h.getName()+":"+h.getHp());
		System.out.println(h1.getName()+":"+h1.getHp());

	}
}
