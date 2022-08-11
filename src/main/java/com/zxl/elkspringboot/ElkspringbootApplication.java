package com.zxl.elkspringboot;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class ElkspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkspringbootApplication.class, args);
        System.out.println("Start Success");
    }
    @Autowired
    private Environment environment;
    @Scheduled(cron = "0/5 * * * * ?")
    public void schedulingMessage() {
        log.info("服务：{},时间：{} 打印的日志,端口：{}", environment.getProperty("spring.application.name",String.class), DateUtil.formatDateTime(DateUtil.date()), environment.getProperty("server.port",Integer.class));
    }


}
