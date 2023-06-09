package com.huyoa.csdnRes.timer;

import com.huyoa.csdnRes.csdnrefresh.service.CsdnService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author houhaoyu
 * @title: com.huyoa.csdnRes.timer
 * @projectName csdnRes
 * @description: TODO
 * @date 2023/6/917:46
 */
@Configuration
@Slf4j
public class CsdnTimer {

    @Autowired
    private CsdnService csdnService;
    @Scheduled(cron = "0 15,45 * * * ? ")
    public void csdnRefresh(){
        log.info("=================================start===================================");
        csdnService.csdnRefresh();
        log.info("=================================end===================================");
    }
}
