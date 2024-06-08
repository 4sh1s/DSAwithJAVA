package dataStructuresAlgorithms;

import java.util.*;

public class LeetCodeSolutions {

    public void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) { //given 2 sorted Arrays , derive a singular array that is also sorted
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public int removeElement(int[] nums, int val) {
        int i=0,p=0;
        for(int n: nums){
        if(nums[i++]!=val){
            nums[p++]=nums[i-1];
        }
        }
        return p;
    }

    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public int removeDuplicatesTwo(int[] arr) {
        int i=1;
        for(int j=2;j<arr.length;j++){
            if(arr[i]!=arr[j]||arr[i-1]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public int majorityElement(int[] nums) {//Moore's Voting Algorithm, Given an array of integers , find the int with the most repetition

       int count = 0;
       int candidate= 0;
        for (int num : nums){
            if(count==0) candidate=num;
            if (candidate==num)
            count++;
            else count --;
        }
        return candidate;
    }

    public int maximumSum(int[] nums) { // Also known as Kadane's algorithm , given an array of integers find the subarray that has the maximum sum
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int num : nums) {
            curSum += num;
            maxSum = Integer.max(maxSum, curSum);
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }




    }
