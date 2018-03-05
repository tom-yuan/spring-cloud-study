package cn.yishi.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.yishi.microservice.service.SchedualServiceHello;

@RestController
public class HelloController {
	@Autowired
    SchedualServiceHello helloService;
    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.sayHelloFromClientOne(name);
    }
}
