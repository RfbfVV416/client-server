package org.config_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${worldtime}")
    String url;
    @GetMapping("/showConfig")
    String getUrl(){
        return url;
    }
}
