package com.yesh.assignmentFirst;

import java.util.Date;

public class CategoryMain {

	public static void main(String[] args) {
		Category category = new Category();
		category.setName("javasimple");
		category.setId(100);
		category.setDate(new Date());
		System.out.println(category.showCategoryDetail());

	}

}
