package com.example.demo.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountVisit {

    final
    StringRedisTemplate redisTemplate;

    public CountVisit(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @GetMapping("/hello")
    public String count() {
        Long count = redisTemplate.opsForValue().increment("count");
        return "页面访问了【" + count + "】次";
    }
}
