import java.util.concurrent.ThreadLocalRandom;

public class lab_02 implements Runnable {
    @Override
    public void run() {
        String colours[]={"white","blue","black","green","red","yellow"};
        int index= ThreadLocalRandom.current().nextInt(6);
            while(index != 4){
                System.out.println(colours[index]);
            }
    }
}
class solution {
    public static void main(String[] args) {
        lab_02 obj1=new lab_02();
        Thread obj2=new Thread(obj1);
        obj2.start();
    }
}
