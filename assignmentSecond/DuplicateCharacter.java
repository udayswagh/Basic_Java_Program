package com.yesh.assignmentSecond;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	public static Character findDuplicate(String str) {

		Map<Character, Integer> map = new HashMap<>();
		Character maxchar = ' ';

		long max = Integer.MIN_VALUE;

		for (int i = 0; i < str.length(); i++) {
			Character current = str.charAt(i);
			if (map.containsKey(current)) {
				map.put(current, map.get(current) + 1);
			}

			else {
				map.put(current, 1);
			}

			if (map.get(current) > max) {
				maxchar = current;
				max = map.get(current);
			}
		}

		System.out.println(max);

		return maxchar;

	}

	public static void main(String[] args) {
		DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
		String str = "javaaaa";
		System.out.println(DuplicateCharacter.findDuplicate(str));

	}

}
