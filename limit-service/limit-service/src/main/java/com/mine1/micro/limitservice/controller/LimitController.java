package com.mine1.micro.limitservice.controller;

import com.mine1.micro.limitservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(1, 100);
    }
}
