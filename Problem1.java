// Problem1 Array partition (https://leetcode.com/problems/array-partition/)

// Time Complexity : O(nlog(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
// we sort the array to waste least number possible and save larger number for forming pairs
//that we try to minimise the gap/difference between each pair.

// class Solution {
//     public int arrayPairSum(int[] nums) {
//         Arrays.sort(nums);
//         int result=0;
//         for(int i=0;i<nums.length;i=i+2){
//             result+=nums[i];
//         }
//         return result;
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
//we store every num's frequency and store max and min
//iterate over max and min and then add freq/2 times value to the sum(pairing the same digits)
//hangle odd frequency by reducing next nums frequency by 1 and adding value of num one extra time.
class Solution{
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min= Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            min=Math.min(min, num);
            max= Math.max(max, num);
        }
        int result=0;
        boolean flag = false;
        for(int i =min;i<=max;i++){
            if(map.containsKey(i)){
                if(flag) map.put(i,map.get(i)-1);
                int count = map.get(i);
                int pairs= count/2;
                result = (pairs*i)+result;
                if(count%2==0){
                    flag=false;
                }
                else{
                    flag=true;
                    result+= i;
                }
            }
        }
        return result;
    }
}