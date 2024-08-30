import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    //num1 + num2 = target, target - num2 = num1
    public static int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        HashMap<Integer, Integer> compliment = new HashMap<Integer, Integer>();
        for(int i = 0; i <= n; i++)
        {
            if(compliment.containsKey(target-nums[i]))
            {
                return new int[]{compliment.get(target-nums[i]), i};
            }
            compliment.put(nums[i], i);
        }

        return nums;
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == ']' || c == '}' || c == ')')
            {
                if(stack.isEmpty()){ return false;}
                char top = stack.peek();
                if((c == ']' && top == '[' ) || (c == '}' && top == '{') || (c == ')' && top == '('))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public TreeNode invertTree(TreeNode root)
    {
        return root;
    }

    public boolean isAnagram(String s, String t) {
        return true;
    }

    public int search(int[] nums, int target) {
        return target;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return image;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return root;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public boolean isBalanced(TreeNode root) {
        return false;
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    public boolean hasCycle(ListNode head) {
//        return false;
//    }


}
