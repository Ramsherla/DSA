import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while (!stk.isEmpty() && stk.peek() <= current) {
                stk.pop();
            }
            
            if(stk.isEmpty()){
                map.put(current,-1);
            }else{
                map.put(current,stk.peek());

            }
            stk.push(current);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
}