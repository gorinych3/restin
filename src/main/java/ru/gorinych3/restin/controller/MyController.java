package ru.gorinych3.restin.controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping(value = "/connect", produces = "application/json; charset=utf-8")
    public int monitorConnect(@RequestBody String text){
        //System.out.println("Пришел запрос");
        if(text==null){
            return Response.SC_BAD_REQUEST;
        }
        //System.out.println(text);
        return Response.SC_OK;
    }
}
