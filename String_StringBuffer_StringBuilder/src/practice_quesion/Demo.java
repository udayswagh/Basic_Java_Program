package practice_quesion;

public class Demo {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Demo Object";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d=new Demo();
		System.out.println(d); // own toString method of object class internally call

		//System.out.println("Hello"+d);
	
	}

}
