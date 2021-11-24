public class lab_06 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread is running..");
        }
    }

    public static void main(String[] args) {
        lab_06 obj1=new lab_06();
        obj1.setPriority(MAX_PRIORITY);
        obj1.run();
        obj1.setPriority(MIN_PRIORITY);
        obj1.run();
    }
}

