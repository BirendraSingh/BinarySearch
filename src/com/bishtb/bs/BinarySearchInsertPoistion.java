package com.bishtb.bs;

/**
 * Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * @author biren
 *
 */
public class BinarySearchInsertPoistion {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5 ,6, 7};
		System.out.println(searchInsertPoisition(nums, 4));
		System.out.println(searchInsertPoisition(nums, 8));
		System.out.println(searchInsertPoisition(nums, 6));
		System.out.println(searchInsertPoisition(nums, 0));
		
	}

	public static int searchInsertPoisition(int[] nums, int target) {
		// base case
		if(nums == null || nums.length == 0)
			return 0;
		int l = 0; 
		int r = nums.length - 1;
		int m = l;
		while ( l < r) {
			m = l + (r-l) / 2; // to avlid overflow
			if(nums[m] == target)
				return m;
			if(nums[m] < target)
				l = m +1;
			else
				r = m;
		}
		return (nums[m]<target) ? l+1 : l;
	}
}
