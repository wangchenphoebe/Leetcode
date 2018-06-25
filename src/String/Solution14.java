package String;

import java.util.Arrays;

import javax.print.attribute.ResolutionSyntax;

import Arrays.Solution26;

public class Solution14 {
	//14. ���ַ��������е������ǰ׺��
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
	 
	 //14. LeetCode �ⷨ 
	 public String longestCommonPrefix1(String[] strs) {
	        if(strs == null || strs.length == 0)    return "";
	        String pre = strs[0];
	        int i = 1;
	        while(i < strs.length){
	            //�õ�һ����ģ�壬ƥ�䵽�����е�һ��Ԫ�ص������ǰ׺�ַ�����Ȼ�������Ϊģ�壬�Դ�����ƥ���±����е�Ԫ�أ���󷵻�����ģ��
	            //indexOf�Ǽ���Ӵ��������Ӵ���ʼλ�õĺ���
	            while(strs[i].indexOf(pre) != 0)
	                //���pre�����Ӵ�����ȥ��preĩβһλ���±Ƚϣ�ֱ�����Ӵ�����pre����0ʱ�ͻ���������ѭ��ȥƥ����һ����ѭ��
	                pre = pre.substring(0,pre.length()-1);
	            i++;
	        }
	        return pre;
	    }
	 //Ѱ�������ַ������ǰ׺ 
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
