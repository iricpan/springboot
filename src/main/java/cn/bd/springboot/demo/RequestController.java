package cn.bd.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("getInfo")
    public String getInfo(){
        return "Info";
    }
}
