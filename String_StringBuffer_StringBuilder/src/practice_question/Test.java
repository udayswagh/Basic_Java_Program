package practice_question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String str=" ";
//		str.trim();// because of its not assign that region  no object created 
//		System.out.println(str.equals("")+" "+str.isEmpty());

//		String s="Uday wagh";
//		
//		int l=s.trim().length();
//		System.out.println(l);

		/*
		 * String s="Uday wagh";
		 *  s.trim();
		 *   int i=s.indexOf(" ");
		 *    System.out.println(i);
		 */
	String s1="Java";
	String s2=new String("java");  

	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
}
}