package com.lhj.dubbocloudconsumer.thread.thread;

public class TestThread extends Thread {
    @Override
    public void run() {
//        super.run();
     print();
    }

    public void print(){
        for(int i = 0;i < 100; i++){
            System.out.println("Thread-----"+Thread.currentThread().getName()+"-----"+i);
        }
    }
}
