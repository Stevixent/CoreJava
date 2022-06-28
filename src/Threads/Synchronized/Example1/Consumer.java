package Threads.Synchronized.Example1;

public class Consumer extends Thread{
    SynchronizedMethodE synced;
    public Consumer(SynchronizedMethodE synced){
        this.synced = synced;
    }
    @Override
    public void run(){
        while (true){
            System.out.println("Got called by the consumer");
            synced.getData();
        }
    }

}
