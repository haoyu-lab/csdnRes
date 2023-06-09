package com.huyoa.csdnRes.csdnrefresh.controller;

import com.huyoa.csdnRes.common.AjaxResult;
import com.huyoa.csdnRes.csdnrefresh.service.CsdnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsdnController {

    @Autowired
    private CsdnService csdnService;

    @GetMapping("/csdnRefresh")
    public AjaxResult csdnRefresh(){
        csdnService.csdnRefresh();
        return AjaxResult.build2Success("csdn刷新完成");
    }
}
