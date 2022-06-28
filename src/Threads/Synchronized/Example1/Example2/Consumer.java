package Threads.Synchronized.Example1.Example2;

public class Consumer implements Runnable{
    SynchronizedMethod synced;
    public Consumer (SynchronizedMethod synced){
        this.synced = synced;
        new Thread(this, "Consumer").start();
        System.out.println("Got called by consumer");
    }
    @Override
    public void run(){
        while (true){
            synced.getData();
        }
    }
}
