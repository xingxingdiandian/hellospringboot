package com.example.hellospringboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/src/main/test")
@Api(value = "前端控制器")
@Slf4j
public class TestController {
    private static final Logger LOG  = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ApiOperation(value = "文件上传", notes = "文件上传")
    public String upload(@RequestParam(value="file", required = false) MultipartFile file) {
        File file2  = new File("F:\\a.txt");
        try {
            file.transferTo(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.warn("warn!");
        return "";
    }

    @RequestMapping(value = "/userQuery", method = RequestMethod.POST)
    @ApiOperation(value = "用户列表", notes = "用户列表")
    @ResponseBody
    public String userQuery(@RequestParam(value="file", required = false) MultipartFile file) {
        return "";



    }

}
