package final_vrs_immutable;

public class Test {
	public static void main(String[] args) {

		final StringBuffer sb = new StringBuffer("uday");
		sb.append("software");
		System.out.println(sb);
		
		//sb=new StringBuffer("wagh");   final means we cant assign again 
		//System.out.println(sb);
	}

}
