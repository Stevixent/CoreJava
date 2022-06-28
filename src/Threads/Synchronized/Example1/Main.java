package Threads.Synchronized.Example1;

public class Main {
    public static void main(String[] args) {
        SynchronizedMethodE obj = new SynchronizedMethodE();
        Producers p = new Producers(obj);
        Consumer c = new Consumer(obj);
        p.start();
        c.start();
        System.out.println("Put called by producer" + p);
    }
}
