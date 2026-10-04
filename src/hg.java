import java.awt.image.ImageProducer;
import java.util.*;

public class hg {
    static void main() throws InterruptedException {
//        List<Integer> l = new ArrayList<>();
//        l.add(2);
//        l.add(3);
//        l.add(5);
//        l.add(9);
//
//        long count = l.stream().filter((v) -> v > 5).count();
//        System.out.println(count);
//        LinkedHashMap<Integer, String> map =
//                new LinkedHashMap<>(16, 0.75f, true);
//        map.put(3, "C");
//        map.put(1, "A");
//        map.put(2, "B");
//        System.out.println(map);
//
//        System.out.println(map.get(1));
//        System.out.println(map);


//      A a = new A();
//      a.start();
//
//      Thread.sleep(2000);
//        System.out.println(Thread.currentThread().getName());
        double x = 10.0/3;
//Thread t = new Thread(()-> System.out.println(x));
//t.start();
        ArrayList<String> l = new ArrayList<>();
        l.add("A");
        l.add("A");
        l.add("B");
        l.add("B");
        l.add("C");

         HashMap<String,Integer> hs = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            hs.put(l.get(i),hs.getOrDefault(l.get(i),0)+1);
        }
        System.out.println(hs);
        Integer i = hs.get("A");
        System.out.println(i);

    }

}
//class A extends Thread{
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//class A implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//    }
//}