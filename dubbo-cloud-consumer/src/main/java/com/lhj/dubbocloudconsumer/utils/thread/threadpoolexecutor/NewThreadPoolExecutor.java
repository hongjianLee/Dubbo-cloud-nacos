package com.lhj.dubbocloudconsumer.utils.thread.threadpoolexecutor;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NewThreadPoolExecutor {
    /**
     * 我们获取四次次线程，观察4个线程地址
     * @param args
     */
    public static  void main(String[]args)
    {
        ThreadPoolExecutor threadPoolExecutor  = new ThreadPoolExecutor(4,8,1, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>());
        System.out.println("****************************newFixedThreadPool*******************************");
        for(int i=0;i<4;i++)
        {
            final int index=i;
            threadPoolExecutor.execute(new ThreadForpools(index));
        }
        threadPoolExecutor.shutdown();
    }
}
