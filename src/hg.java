import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
Thread t = new Thread(()-> System.out.println(Thread.currentThread().getName()));
t.start();
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