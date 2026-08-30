package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    static void main() {
        List<Integer>l = new ArrayList<>();
       nQueens(0,l,10);
    }

    public static void nQueens(int row, List<Integer> list,int n){
        if(row == n){

            printBoard(list, n);
            return;
        }

        for(int col = 0; col < n; col++) {
           if(isValid(row,col,list)){
               list.add(col);
               nQueens(row+1,list,n);
               list.remove(list.size()-1);

           }



        }




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

     static void printBoard(List<Integer> positions , int n) {
        for (int row = 0; row < n; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < n; col++) {
                line.append(positions.get(row) == col ? "Q " : ". ");
            }
            System.out.println(line);
        }
        System.out.println();
    }

}
