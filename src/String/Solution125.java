package String;

import java.util.Arrays;

public class Solution125 {
	//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
	public boolean isPalindrome(String s) {
		if(s == null || s.length() == 0)
			return true;
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a>='0' && a<='9'))
				str.append(a);
		}
		char[] strToString = str.toString().toLowerCase().toCharArray();
		int length = strToString.length;
		int mid = strToString.length/2;
		int i = 0,j = 0;
		int afterMid = length % 2 == 0 ? mid : (mid + 1);
		for(i = 0, j = length-1; i< mid && j>=afterMid; i++,j--) {
			if(strToString[i] != strToString[j])
				break;
		}
		if(i < mid && j>=afterMid)
			return false;
		
        return true;
    }
	//standard solution
	public boolean isPalindrome2(String s) {
		if(s == null || s.length() == 0)
			return true;
		s = s.toLowerCase();
		int i = 0, j = s.length()-1;
		while(i<j) {
			char m = s.charAt(i);
			char n = s.charAt(j);
			if(!isNumAlp(m)) {i++; continue;};
			if(!isNumAlp(n)) {j--; continue;};
			if(m != n ) return false;
			i++;
			j--;
		}
		return true;
	}
	public boolean isNumAlp(char a) {
		if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a>='0' && a<='9'))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Solution125 solution = new  Solution125();
		String[] strs = new String[] {"flower","flow","flight"};
		String[] strs2 = new String[] {"dog","racecar","car"};
		String s1 = "A man, a plan, a canal: Panama";
		String s2 = "0p";
		System.out.println(solution.isPalindrome(s1));
	}
}
