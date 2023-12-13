package work;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable thread1 = ()-> {
            for(int i = 1;i<10;i++){
                System.out.println("Value of i is " + i*2);
            }
            try {
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        };

        Thread t = new Thread(thread1);
        t.setName("xyz");
        t.start();
    }
}
