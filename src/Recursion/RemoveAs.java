package Recursion;

public class RemoveAs {
    static void main() {
        System.out.println(remove("baccarat","",0));
    }
    public static String remove(String s,String ans, int index){
        if(index==s.length()){
            return ans;
        }
        if(s.charAt(index)!='a'){
            ans = ans + s.charAt(index);
        }

        return remove(s,ans,index+1);

    }
}
