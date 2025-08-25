// Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// 1. Initialize two variables:currentSum - the maximum sum of the subarray ending at the current index
// and maxSum - the overall maximum sum found so far.
// 2.Traverse the array: For each element i, decide whether to add it to currentSum or start a new subarray from i.
// Update maxSum if currentSum becomes larger.
// 3. Return maxSum after the loop.

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum =Integer.MIN_VALUE.     ;
        int currentSum =0;
        for(int i: nums){
            if(currentSum+i>=i) currentSum+=i;
            else currentSum = i;
            if(currentSum>maxSum) maxSum=currentSum;
        }
        return maxSum;
    }
}