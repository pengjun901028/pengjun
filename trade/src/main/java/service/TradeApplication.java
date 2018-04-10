package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class TradeApplication {
    @RequestMapping("/service2")
    public String service2() {
        return "service2";
    }

    public static void main(String[] args) {
        SpringApplication.run(TradeApplication.class, args);
    }
}