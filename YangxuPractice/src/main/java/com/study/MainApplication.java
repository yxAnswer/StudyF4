package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 文件名: MainApplication.java
 * 描述：启动类
 * Create by Google on 2018/10/15 22:43
 */
@SpringBootApplication
@EnableScheduling //允许开启定时任务
@EnableAsync //开启异步任务
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
