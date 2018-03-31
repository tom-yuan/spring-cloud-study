package cn.yishi.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.yishi.microservice.service.HelloService;

@RestController
public class HelloController {
	@Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.helloService(name);
    }
}
