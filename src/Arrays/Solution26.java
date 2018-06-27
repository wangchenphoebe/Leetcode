package Arrays;

import java.util.Arrays;

public class Solution26 {
	//原地去除有序数组中的重复元素 
	public int removeDuplicates(int[] nums){
		int len = nums.length;
		int countAll = 0;
		for(int i = 0; i < len-countAll; i++){
			int count = 0;
			//count amount of same number with nums[i]
			for(int j = i + 1; j < len-countAll; j++){
				if(nums[j] == nums[i])
					count++;
				else 
					break;
			}
			//move
			for(int j = i + count; j<len; j++){
				nums[j-count] = nums[j];
			}
			countAll += count;	
		}
		
		return  len -countAll;
	}
	//quick and slow pointer
	public int removeDuplicates2(int[] nums){
		if(nums.length == 0) return 0;
		int i =0;
		for(int j=1; j<nums.length; j++) {
			if(nums[j] != nums[i]) {
				i++;
				swap(nums, i, j);
			}
		}
		return i+1;
	}
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		Solution26 solution = new  Solution26();
		int[] a = new int[]{0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(solution.removeDuplicates2(a));
		System.out.println(Arrays.toString(a));
		
	}
}
