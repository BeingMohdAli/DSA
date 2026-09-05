package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC289 {
    static void main() {

    }

    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        if (num == null || num.isEmpty()) return result;
        backtrack(result, new StringBuilder(), num, target, 0, 0L, 0L);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder expr, String num, int target, int index, long currentValue, long prevOperand){

     if(index==num.length()){
         if(currentValue==target){
             result.add(expr.toString());
         }
     }

//     backtrack(result,expr.append(num.charAt(index)),target,index+1,currentValue+((num.charAt(index)-'0'),);
        for (int i = 0; i < num.length(); i++) {

        }

    }
}
