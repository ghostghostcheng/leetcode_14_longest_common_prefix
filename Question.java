package leetcode_14_longest_common_prefix;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class Question {
	public static void main(String args[]) {
		String[] strs = {"aaa", "a", "aa"};
		String LCP = "";
		
		LCP = Solution.longestCommonPrefix(strs);
		
		System.out.print(LCP);
	}
}
