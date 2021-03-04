package com.test.mydemo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangyingcong
 * @Description:
 * @Date: 2021/3/4 15:15
 * @Param:
 * @Return:
 */
@Service
@RestController
@RequestMapping("/task")
public class TaskDaemon {
    private static final Logger LOG = LoggerFactory.getLogger(TaskDaemon.class);
    @Scheduled(fixedDelay = 10*1000)
    @RequestMapping("/daemon")
    public void testTask(){
        LOG.info("》》》》》定时任务测试《《《《");
    }
}
