package com.example.exam.controller;

import com.example.exam.domain.Demo;
import com.example.exam.domain.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : TTF
 * @date : 2024/1/18
 */
@Log4j2
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/demo")
    public Result<Demo> demo() {
        log.info("123123");
        return Result.success(new Demo());
    }
}
