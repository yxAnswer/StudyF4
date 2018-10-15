package com.study.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件名: TestTask.java
 * 描述：
 * Create by Google on 2018/10/15 22:43
 */
@Component
public class TestTask {

    private int i=0;
    @Scheduled(fixedDelay = 1000)
    public void sum(){
        i++;
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("定时任务执行了"+i+"次"+sf.format(new Date()));
    }
}
