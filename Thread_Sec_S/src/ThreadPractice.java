class CC {
    public void run(){
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
    }
}

class ThreadPractice1 implements Runnable{
    @Override
    public void run() {
        System.out.println("in thread");
    }
}


public class ThreadPractice implements Runnable {
    String name;
    public ThreadPractice(String name){
        this.name = name;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 10; i++) {
//            System.out.println(name + " " + i);
//        }
//        System.out.println(name + " finished");

    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadPractice("Thread 1"));
        Thread t2 = new Thread(new ThreadPractice("Thread 2"));
        Thread t3 = new Thread(new ThreadPractice("Thread 3"));

        System.out.println(Thread.currentThread().getName());

        t1.start();
        t2.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println("Exception occurred in thread 1");
        }


        try {
            t2.join();
        }
        catch (Exception e){
            System.out.println("Exception occurred in thread 1");
        }

        try {
            t3.join();
        }
        catch (Exception e){
            System.out.println("Exception occurred in thread 1");
        }


        t3.start();

//        System.out.println("brit");

//        ThreadPractice1 threadPractice1 = new ThreadPractice1();
//        Thread thread = new Thread(threadPractice1);
//        thread.start();
//        CC c1 = new CC();
//        CC c2 = new CC();
//        c1.run();
//        c2.run();


    }

}


class A{
    public static void main(String[] args) {
        System.out.println("brif");
    }
}