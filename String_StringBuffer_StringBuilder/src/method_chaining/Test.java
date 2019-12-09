package method_chaining;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
		sb.append("uday").append("solution").reverse().insert(2, "XYZ").delete(3, 7);
		System.out.println(sb);

	}

}
