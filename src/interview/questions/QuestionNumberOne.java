package interview.questions;

import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuestionNumberOne {

	public static void main(String[] args) {
		/*
		 * 
		 * Laerdal Medical : 1st Technical Round
		 * 
		 * Input : str = "Java Is Great Programming Language" output: javisgretpomnlu
		 * Explaination : remove the duplicate character using java 8
		 * 
		 */

		String str = "Java Is Great Programming Language";

		LinkedHashSet<Character> hashSet = str.toLowerCase()
				.replace(" ", "")
				.chars()
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.toCollection(LinkedHashSet::new));

		System.out.println(" approach 1 :\n" +hashSet);
		
		System.out.println("\n approach 2 :");
		str.toLowerCase()
		.replace(" ", "")
		.chars()
		.mapToObj(ch -> (char) ch)
		.distinct()
		.forEach(System.out::print);
		System.out.println("\n");

		// guess the output
		int x = 0, y = 0;
		for (int z = 0; z < 5; z++) {
			if (++x > 2 || ++y > 2) {
				x++;
			}
		}
		System.out.println("X :" + x + "   Y :" + y);

	}

}
