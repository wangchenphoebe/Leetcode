package String;

public class Solution28 {
	/**
	 * 给定一个 haystack 字符串和一个 needle 字符串，
	 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
	 * 如果不存在，则返回  -1。
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {
		if(needle == null || needle.length() == 0 ) return 0;
		
		int len1 = haystack.length();
		int len2 = needle.length();
		if(len1 < len2) return -1;
		for(int i = 0 ; i <= len1- len2; i ++) {
			int j = 0;
			for(j = 0; j< len2; j++) {
				if(haystack.charAt(i+j) != needle .charAt(j)) break;
			}
			if(j == len2) return i;
		}
		return -1;
    }
	public static void main(String[] args) {
		Solution28 solution = new  Solution28();
		String[] strs = new String[] {"flower","flow","flight"};
		String[] strs2 = new String[] {"dog","racecar","car"};
		String s1 = "mississippi";
		String s2 = "issip";
		System.out.println(solution.strStr(s1,s2));
	}
}
