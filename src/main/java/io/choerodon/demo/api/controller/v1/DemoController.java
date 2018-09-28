package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("v1/demo")
public class DemoController {

    @Value("${content}")
    private String content;

    @GetMapping("/hello")

    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>(content, HttpStatus.OK);
    }
}
