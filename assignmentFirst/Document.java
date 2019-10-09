package com.yesh.assignmentFirst;

public class Document {
	private String titile;
	private String filepath;

	public String showDocumentinformation() {

		String str = ("title: " + getTitile() + " " + "filepath: " + getFilepath());
		return str;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}
