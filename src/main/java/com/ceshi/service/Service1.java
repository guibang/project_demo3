package com.ceshi.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Service1 {
    @Retryable(value = { Exception.class }, maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2))
    public String fun1(String param1) {
        System.out.println("-----------------------aaaaaaaaaaaaaaaaaa----------------------------");
        if ("error".equals(param1)) {
            int i = 1/0;
        }
        return "正常";
    }

}
