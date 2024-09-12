package leetCodeEasy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoOfConsistent1684 {

	public static void main(String[] args) {
		String allowed = "cad";
		String[] words = new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
		countConsistentStrings(allowed, words);
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		Set<Character> allowedCharList = new HashSet<>();
		for (char chars : allowed.toCharArray()) {
			allowedCharList.add(chars);
		}
		int count = 0;
		for (String word : words) {
			boolean ok = true;
			for (char wordChar : word.toCharArray()) {
				if (!allowedCharList.contains(wordChar)) {
					ok = false;
					break;
				}
			}
			if (ok) {
				count++;
			}
		}
		return count;

	}

	public static int countConsistentStringsRaw(String allowed, String[] words) {
		List<Character> allowedCharList = new ArrayList<>();
		char[] allowedChar = allowed.toCharArray();
		for (char chars : allowedChar) {
			allowedCharList.add(chars);
		}
		int count = 0;
		for (String word : words) {
			char[] wordChars = word.toCharArray();
			boolean ok = true;
			for (char wordChar : wordChars) {
				if (allowedCharList.contains(wordChar)) {

				} else {
					ok = false;
					break;
				}
			}
			if (ok) {
				count++;
			}
		}
		System.out.println(count);
		return count;

	}

}
