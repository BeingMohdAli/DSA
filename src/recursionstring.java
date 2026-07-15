import java.util.ArrayList;
import java.util.List;

public class recursionstring {

    static void main() {
        System.out.println(lc17("23"));






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


  static List<String> lc17(String s){
      String[] map = {
              "", "", "abc", "def", "ghi",
              "jkl", "mno", "pqrs", "tuv", "wxyz"
      };

        if(s.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char ch = s.charAt(0);
        int index = ch-'0';
      String pair = map[index];
      List<String> small = lc17(s.substring(1));
      List<String> answer = new ArrayList<>();

      for (int i = 0; i < pair.length(); i++) {
             char c = pair.charAt(i);
          for (int j = 0; j < small.size(); j++) {


              answer.add(c+small.get(j));
          }
      }


      return answer;

  }

}
