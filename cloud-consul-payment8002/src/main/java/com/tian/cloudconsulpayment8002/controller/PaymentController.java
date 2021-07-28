package com.tian.cloudconsulpayment8002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package: com.tian.cloudconsulpayment8002.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/28 10:14
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@Controller
@RequestMapping("payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverport;

    @RequestMapping("payment/consul")
    public String login(){
        return serverport+"端口已经连接！";
    }
}
