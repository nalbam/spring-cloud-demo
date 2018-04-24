package com.nalbam.spring.demo.task;

import com.nalbam.spring.demo.service.HelloRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloTask {

    @Autowired
    private HelloRequestService helloRequestService;

    @Scheduled(fixedRate = 100)
    public void send100() {
        log.info("Task : " + helloRequestService.hello("Task100", 100));
    }

    @Scheduled(fixedRate = 100)
    public void send_33() {
        log.info("Task : " + helloRequestService.hello33("Task-33"));
    }

    @Scheduled(fixedRate = 100)
    public void send_66() {
        log.info("Task : " + helloRequestService.hello66("Task-66"));
    }

    @Scheduled(fixedRate = 100)
    public void send_99() {
        log.info("Task : " + helloRequestService.hello99("Task-99"));
    }

}
