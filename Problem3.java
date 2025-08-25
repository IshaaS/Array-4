// Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//find action digit by comparing i with i+1 from end of numbers
//then find a digit just greater than action number then put it instead of action digit
//now put rest as increasing oder
// if no breach found, reverse the number

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null) return;
        int n=nums.length;
        //find breach
        int i=0;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1,n-1);

    }
    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i!=j){
            nums[i]= nums[i]+nums[j];
            nums[j]= nums[i]-nums[j];
            nums[i]= nums[i]-nums[j];
        }
    }
}

