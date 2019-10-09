package com.yesh.assignmentFirst;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.setFirstname("PankajSir ");
		member.setLastname("Sharma");
		member.setRole("Trainer");
		member.setPassword(12345);
		member.setEmail("sharma.pankaj@yash.com");
		System.out.println(member.showMemberDetail());

	}

}
