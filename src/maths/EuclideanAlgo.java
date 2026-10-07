package maths;

public class EuclideanAlgo {
    static void main() {
        System.out.println(lCM(10,5));
    }

    public static int ea(int a , int b){
        if(b==0)
        {
            return a;
        }
      return ea(b, a % b);

    }
    public static int lCM(int x , int y){
        int hcf =  ea(x, y);
        return  (x *y)/hcf;
    }
}
