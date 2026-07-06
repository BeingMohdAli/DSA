import java.util.ArrayList;
import java.util.List;

public class recursionstring {

    static void main() {
        System.out.println(permutation("abc"));
    }

    static String fun(String s){
//        use .isEmpty() always if checking whatever the string is empty or not means 0 length like this ""
//        .isEmpty() will be false if string is equal to this " " because length is not zero
    if(s.isEmpty()){
        return "";

    }

    char a  = s.charAt(0);

    if(a=='a'){
       return fun(s.substring(1));
    }
//#this concatenation will work because this whole thing will become string char + str = str
    return a + fun(s.substring(1));


    }


    static List<String> permutation(String s){
        if(s.length()==1){
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;

        }

        char a = s.charAt(0);
        List<String> small = permutation(s.substring(1));
        List<String> ans = new ArrayList<>();
        for(String i:small){
            ans.add(a+i);
            ans.add(i+a);
        }
        return ans ;
    }

}
