public class lab_03 extends Thread{
    public void run(){
        for(int i=0;i<=20;i=i+2){
            System.out.println(i);
        }
    }
}
 class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<20;i=i+2){
            System.out.println(i);
        }
    }
}
class Even_Odd {
    public static void main(String[] args) {
        lab_03 t1 = new lab_03();
        Thread t2 = new lab_03();
        Thread1 obj3=new Thread1();
        Thread t3=new Thread(obj3);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}