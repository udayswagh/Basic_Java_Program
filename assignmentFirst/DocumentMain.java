package com.yesh.assignmentFirst;

public class DocumentMain {

	public static void main(String[] args) {
		Document document = new Document();
		document.setTitile("java");
		document.setFilepath("c/document/core java/basic/introduction.pdf");

		System.out.println(document.showDocumentinformation());
	}

}
