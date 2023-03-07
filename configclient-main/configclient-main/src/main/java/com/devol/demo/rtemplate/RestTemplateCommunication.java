package com.devol.demo.rtemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateCommunication {

    @Value("${question.rtemplate}")
    private String questionRestTemplate;
    @Autowired
    private RestTemplate restTemplate;

    // curl http://localhost:8080/rest-feign
    @GetMapping("/rest-template")
    public String llamada() {
        String url =  "http://localhost:8081/rt-llamada";
        String respuesta = restTemplate.getForObject(url, String.class);
        return "\n A:" + questionRestTemplate + "\n B: " + respuesta;
    }


}
