package com.bishtb.bs;

public class BinarySearchSample {

	public static void main(String[] args) {
		int[] nums = {1,2,6,7,8,9,10};
		System.out.println(search(nums, 3));
		System.out.println(search(nums, 10));
		System.out.println(search(nums, 20));

	}

	// iterative approach
	public static int search(int[] nums, int target) {
		
		int lo = 0;
		int h = nums.length -1;
		while(lo<=h) {
			int mid = lo +(h-lo) /2;
			if(nums[mid] < target) {
				lo = mid+1;
			} else if (nums[mid] > target) {
				h = mid -1;
			} else 
				return mid;
		}
	    return -1;
	}

	// Recurssion
	public static int search(int[] nums, int target, int lo, int h) {
		if(lo == h)
			return -1;
		int mid = lo + (h-lo) /2;
		if(nums[mid] < target) {
			return search(nums, target, mid+1, h);
		}
		if (nums[mid] > target) {
			return search(nums, target, lo, mid-1);
		}
		return mid;
	}

}
