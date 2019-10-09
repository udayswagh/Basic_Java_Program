package com.yesh.assignmentSecond;

public class ActionUrl {
	public ActionUrl() {

	}

	public String checkOpenUrl(String url) {

		String str = null;
		String[] words = url.split("/");
		for (int i = words.length - 1; i > 0; i--) {

			str = words[i];
			break;

		}

		return str;

	}


}
