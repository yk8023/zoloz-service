package com.ekyc.controller;

import com.ekyc.entity.Test;
import com.ekyc.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangkai
 * @since 2025-02-21
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @GetMapping("/testmapper")
    public String test(){
        Test test = testMapper.selectById(1);
        System.out.println(test);
        return test.getName();
    }
}
