package Arrays;

import java.util.Arrays;

public class Sloution35 {
	/**
	 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
	      你可以假设数组中无重复元素。
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
	    return binarySearch(nums, 0, nums.length-1, target);      
    }
	public int binarySearch(int[] nums, int i, int j, int target) {
		if(i > j) return i;
		int mid = i + (j - i)/2;
		if(nums[mid] == target) return mid;
		else if(nums[mid] > target) return binarySearch(nums, i, mid-1, target);
		else return binarySearch(nums, mid+1, j, target);
	}
	public static void main(String[] args) {
		Sloution35 solution = new  Sloution35();
		int[] a = new int[]{1,3,5,6};
		System.out.println(solution.searchInsert(a,7));
		System.out.println(Arrays.toString(a));
		
	}
}
