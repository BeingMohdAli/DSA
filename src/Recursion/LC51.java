package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC51 {

    static void main() {
        List<Integer> l = new ArrayList<>();
        List<List<String>> lists = nQueens(0, l, 4);
        System.out.println(lists);

    }

    public static List<List<String>> nQueens(int row, List<Integer> list, int n) {
        if (row == n) {
            List<List<String>> l1 = new ArrayList<>();
            List<String> strings = printBoard(list, n);

            l1.add(strings);
            return l1 ;
        }
        List<List<String>> arrayList = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, list)) {
                list.add(col);
                List<List<String>> l1 = nQueens(row + 1, list, n);
                arrayList.addAll(l1);
                list.remove(list.size() - 1);

            }


        }

return arrayList;
    }

    static boolean isValid(int row, int col, List<Integer> positions) {
        for (int prevRow = 0; prevRow < positions.size(); prevRow++) {
            int prevCol = positions.get(prevRow);

            if (prevCol == col) return false;   // same column

            // same diagonal whenever the row-gap equals the column-gap
            if (Math.abs(prevCol - col) == Math.abs(prevRow - row)) return false;
        }
        return true;   // no conflicts with anything placed so far
    }


    static List<String> printBoard(List<Integer> positions, int n) {
//        List<String> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        for (int row = 0; row < n; row++) {

            String s = "";
            for (int col = 0; col < n; col++) {
                if (positions.get(row) == col) {
                    s = s + "Q";
                } else {
                    s = s + ".";
                }

            }
            l.add(s);
//            l.addAll(l);

        }
        return l;
    }
}
