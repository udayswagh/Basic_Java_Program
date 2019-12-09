
public class Test {
	public static void main(String[] args) {

		/* String immutable */

//		String s=new String("uday");
//		s.concat("wagh");
//		System.out.println(s);
//		

		/* StringBuffer are mutable */
//		StringBuffer s=new StringBuffer("uday");
//		s.append("wagh");
//		System.out.println(s);

		/* ==operator comapare reference comparision */

//		String s1=new String("uday");
//		String s2=new String("uday");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));    //equal method are already availble in string class it will override n compair contain 
//		
//		StringBuffer sb1 = new StringBuffer("uday");
//		StringBuffer sb2 = new StringBuffer("uday");
//		System.out.println(sb1 == sb2);
//		System.out.println(sb1.equals(sb2));
	
		String s1=new String("you can't change me");
		String s2=new String("you can't change me");
		
		System.out.println(s1==s2);
		
		String s3="you can't change me";
		System.out.println(s1==s3);
		
		String s4="you can't change me";
		
		System.out.println(s3==s4);
		
		String s5="you can't"+"change me";

		System.out.println(s4==s5);
		 
		String s6="you can't";
		String s7=s6+"change me";
		System.out.println(s6==s7);
		
		final String s8="you can't";
	
		String s9=s8+"change me";
		
		System.out.println(s4==s9);
		
	
	
	
	}

}
