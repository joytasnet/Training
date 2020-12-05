public class NoteBook extends Book{
	String content="";
	public NoteBook(int page,int price){
		super(page,price);
	}
	public void write(String str){
		this.content += str;
	}
	@Override
	public void showStatus(){
		super.showStatus();
		System.out.println("内容:"+this.content);
	}
}
