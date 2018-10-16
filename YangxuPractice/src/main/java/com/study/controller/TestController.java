package com.study.controller;

import com.study.pojo.JsonData;
import com.study.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.events.StartDocument;
import java.util.concurrent.Future;

/**
 * 文件名: TestController.java
 * 描述：
 * Create by Google on 2018/10/16
 */
@RestController
public class TestController {

    @Autowired
    AsyncTask asyncTask;

    /**
     * 测试异步任务
     *
     * @return
     */
    @GetMapping("/v1/test_async")
    public Object exeAsync() throws InterruptedException {
        long begin = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        Future<String> stringFuture = asyncTask.task3();
        for (; ; ) {
            if (stringFuture.isDone()) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        long total = end - begin;
        System.out.println("总耗时---" + total);
        return JsonData.success(total);
    }
}
