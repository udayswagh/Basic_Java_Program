package com.yesh.assignmentFirst;

import java.util.Date;

public class SectionMain {
	public static void main(String[] args) {

		Section section = new Section();
		section.setName("java");
		section.setId(201);
		section.setDate(new Date());

		System.out.println(section.showSectionDetail());
	}

}
