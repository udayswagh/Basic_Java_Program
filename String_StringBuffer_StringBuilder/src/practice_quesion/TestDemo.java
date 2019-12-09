package practice_quesion;

class App{
	String msg;
	public App( String msg) {
	this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg +" Byeee";
	}
	
}
public class TestDemo {

	public static void main(String[] args) {

		//TestDemo td=new TestDemo();
		System.out.println("Hello:-"+new StringBuilder("java 8"));
		
		System.out.println("Hello:-"+new App("Hiiiii"));
		
	}

}
