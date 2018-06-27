package Arrays;

import java.awt.font.MultipleMaster;
import java.util.Arrays;

import javax.print.attribute.ResolutionSyntax;

public class Solution27 {
	/**
	 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums, int val) {
		if(nums == null || nums.length == 0) return 0;
		int  i = 0;
		int len = nums.length;
		//i always points to the first site of val.
		while(i < len && nums[i] != val) {
			i++;
		}
		for(int j = i + 1; j < len; j++) {
			if(nums[j] != val) {
				swap(nums, i, j);
				i++;
			}
		}
	    return i ;    
    }
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		Solution27 solution = new  Solution27();
		int[] a = new int[]{22};
		
		System.out.println(solution.removeElement(a,3));
		System.out.println(Arrays.toString(a));
		
	}
}
