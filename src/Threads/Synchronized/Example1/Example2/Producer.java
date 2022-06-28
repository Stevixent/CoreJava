package Threads.Synchronized.Example1.Example2;

public class Producer implements Runnable{
    SynchronizedMethod synced;
    public Producer(SynchronizedMethod synced){
        this.synced = synced;
        new Thread(this, "Producer").start();
        System.out.println("Put called by producer");
    }
    @Override
    public void run(){
        int data = 1;
        while (true){
            data += 1;
            synced.putData();
        }
    }
}
