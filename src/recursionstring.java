public class recursionstring {

    static void main() {
        System.out.println(fun("dffdsaaada"));
    }

    static String fun(String s){
    if(s.isEmpty()){
        return "";

    }

    char a  = s.charAt(0);

    if(a=='a'){
       return fun(s.substring(1));
    }

    return a + fun(s.substring(1));


    }

}
