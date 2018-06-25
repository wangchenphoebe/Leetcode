package String;

import java.util.Arrays;

import javax.print.attribute.ResolutionSyntax;

import Arrays.Solution26;

public class Solution14 {
	//14. 找字符串数组中的最长公共前缀。
	 public String longestCommonPrefix(String[] strs) {
		 String common = "";
		 if(strs.length == 0) return "";
		 else if(strs.length == 1) return strs[0];
		 else  common = find(strs[0], strs[1]);
		 
		 for(int i = 2 ; i < strs.length; i++) {
			 if(common.equals("")) break;
			 common = find(common, strs[i]) ;
		 }
		 return  common;      
	  }
	 
	 //14. LeetCode 解法 
	 public String longestCommonPrefix1(String[] strs) {
	        if(strs == null || strs.length == 0)    return "";
	        String pre = strs[0];
	        int i = 1;
	        while(i < strs.length){
	            //拿第一个做模板，匹配到数组中第一个元素的最长公共前缀字符串，然后以这个为模板，以此类推匹配下边所有的元素，最后返回最终模板
	            //indexOf是检测子串并返回子串起始位置的函数
	            while(strs[i].indexOf(pre) != 0)
	                //如果pre不是子串，就去掉pre末尾一位重新比较，直到是子串或者pre长度0时就会跳出本次循环去匹配下一轮外循环
	                pre = pre.substring(0,pre.length()-1);
	            i++;
	        }
	        return pre;
	    }
	 //寻找两个字符串的最长前缀 
	    public String find(String a, String b){
	    	if(a.length() == 0 || b.length() == 0)
	    		return "";
	    	int maxlen = -1;
	    	for(int i = 0; i < a.length() && i < b.length(); i++) {
	    		if(a.charAt(i) == b.charAt(i))
	    			maxlen = i;
	    		else break;
	    	}	
	    	if(maxlen < 0) return "";
	        return a.substring(0, maxlen+1);
	  }
	    
		public static void main(String[] args) {
			Solution14 solution = new  Solution14();
			String[] strs = new String[] {"flower","flow","flight"};
			String[] strs2 = new String[] {"dog","racecar","car"};
			System.out.println(solution.longestCommonPrefix(strs2));
		}
}
