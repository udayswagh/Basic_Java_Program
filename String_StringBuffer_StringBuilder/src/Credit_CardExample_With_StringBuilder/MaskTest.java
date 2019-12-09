package Credit_CardExample_With_StringBuilder;

public class MaskTest {

	public  static String mask(String creditcard) {
		String s = "xxxx-xxxx-xxxx-";
		//return s+creditcard.substring(15,19); //Its correct code
		
		
//
//		StringBuilder sb = new StringBuilder(creditcard);//  this logic is not correct 
//		sb.substring(15, 19);
//		return s + sb;
	
		StringBuffer sb = new StringBuffer(s);// This logic also correct
		sb.append(creditcard,15,19);
		return sb.toString();
		
//		StringBuilder sb=new StringBuilder(creditcard);// This logic is not Correct
//		StringBuilder sbb=sb.insert(0, s);
//		return sbb.toString();

	}
	

	public static void main(String[] args) {
		
		String x = mask("1234-5678-9012-4444");
		System.out.println(x);
	}

}
