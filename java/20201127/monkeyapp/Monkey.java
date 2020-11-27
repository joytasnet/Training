public class Monkey {
	/****フィールド変数****/
		//名前
		String name;
		//年齢
		int age;
	/****コンストラクタ****/
		//名前と年齢を受け取るコンストラクタ
		public Monkey(String name,int age){
			this.name=name;
			this.age=age;
		}
	/****メソッド****/
	//挨拶をするメソッド
	public void greet(){
		//例)こんにちは[名前]([年齢]才)です。よろしく！
		System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,this.age);
	}
	//竹馬をするメソッド
	public void takeuma(){
		//例)[名前]は上手に竹馬にのった！
		System.out.printf("%sは上手に竹馬にのった！%n",this.name);
	}
	//逆立ちをするメソッド
	public void sakadachi(){
		//例)[名前]はひょいと逆立ちをした！
		System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
	}
}
