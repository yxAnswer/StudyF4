package com.study.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * 文件名: AsyncTask.java
 * 描述：异步任务业务类
 * Create by Google on 2018/10/15
 */
@Component
public class AsyncTask {

    @Async
    public void task1() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时---"+(end-begin));
    }
    @Async
    public void task2() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时---"+(end-begin));
    }
    @Async
    public Future<String> task3() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(5000);
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时---"+(end-begin));
        return new AsyncResult<>("任务3");
    }

}
