package Recursion;

public class subsets {
    static void main() {
        subsetsOfString("abc","");
    }
    public static void subsetsOfString(String input,String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char c = input.charAt(0);
        subsetsOfString(input.substring(1),output+c);
        subsetsOfString(input.substring(1),output);

    }
}
