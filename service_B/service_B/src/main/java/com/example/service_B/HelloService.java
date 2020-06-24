package com.example.service_B;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;

@RestController
public class HelloService {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World from service_B";
    }

    @RequestMapping("/hello_from_remote")
    public String helloFromRemote(){

        String baseUrl = "http://192.168.99.100:8000/hello";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        for(int i=0;i<10;i++){
            ResponseEntity<String> response = new RestTemplate().exchange(baseUrl,
                    HttpMethod.GET, entity,String.class);
            System.out.println(response.getBody());
        }
        return "End of the loop in HelloService: Service_B";

    }

}
