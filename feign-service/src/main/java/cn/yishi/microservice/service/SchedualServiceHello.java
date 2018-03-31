package cn.yishi.microservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-service", fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
