//class Solution {
//    public List<String> generateParenthesis(int n) {
//
//        List<String> ans = new ArrayList<>();
//
//        generateParenthesis("", 0, 0, n, ans);
//
//        return ans;
//    }
//
//    public  void generateParenthesis(
//            String output,
//            int open,
//            int close,
//            int n,
//            List<String> ans) {
//
//        // Base case
//        if (open == n && close == n) {
//            ans.add(output);
//            return;
//        }
//
//        // Choice 1: add '('
//        if (open < n) {
//            generateParenthesis(
//                    output + "(",
//                    open + 1,
//                    close,
//                    n,
//                    ans
//            );
//        }
//
//        // Choice 2: add ')'
//        if (close < open) {
//            generateParenthesis(
//                    output + ")",
//                    open,
//                    close + 1,
//                    n,
//                    ans
//            );
//        }
//    }
//}