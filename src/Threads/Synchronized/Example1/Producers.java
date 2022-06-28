package Threads.Synchronized.Example1;

public class Producers extends Thread{
    SynchronizedMethodE sycned;
    public Producers(SynchronizedMethodE sycned){
        this.sycned = sycned;
    }
    @Override
    public void run(){
        int data = 700;
        while (true){
            System.out.println("Put called by producer");
            sycned.putData(data++);
        }

    }

    }

