import java.util.*;
public class lastVisitedInteger {
   
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int j = 0;

        for (String word : words) {
            if (word.equals("prev")) {
                if (stack.isEmpty()) {
                    ans.add(-1);
                } else {
                    Stack<String> tempStack = new Stack<>();
                    int prevInteger = Integer.parseInt(stack.pop());

                    // Check for consecutive "prev" strings and update prevInteger
                    while (!stack.isEmpty() && stack.peek().equals("prev")) {
                        tempStack.push(stack.pop());
                    }
                    
                    while (!tempStack.isEmpty()) {
                        stack.push(tempStack.pop());
                    }

                    ans.add(prevInteger);
                }
            } else {
                stack.push(word);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        lastVisitedInteger solution = new lastVisitedInteger();
        List<String> words = Arrays.asList("1", "prev", "2", "prev", "prev");
        List<Integer> result = solution.lastVisitedIntegers(words);
        System.out.println(result); // Output: [1, 2, 1]
    }
}
///correct ans 
// import java.util.*;
// class Solution {
//     public List<Integer> lastVisitedIntegers(List<String> words) {
//         List<Integer> ans = new ArrayList<>();
//         Stack<Integer> nums = new Stack<>();
//         int consecutivePrev = 0;

//         for (String word : words) {
//             if (word.equals("prev")) {
//                 if (consecutivePrev < nums.size()) {
//                     ans.add(nums.get(nums.size() - consecutivePrev - 1));
//                 } else {
//                     ans.add(-1);
//                 }
//                 consecutivePrev++;
//             } else {
//                 nums.push(Integer.parseInt(word));
//                 consecutivePrev = 0;
//             }
//         }

//         return ans;
//     }
// }
