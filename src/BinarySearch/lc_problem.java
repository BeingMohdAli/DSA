package BinarySearch;

public class lc_problem {
    static void main() {
        char[] letters = {'c', 'f', 'j'};
        char target ='f';
        System.out.println(Ceilofalphabet(letters,target));
    }

    static char Ceilofalphabet(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        if(target>=arr[arr.length-1]){
            return arr[0];
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return arr[start];
    }
}
