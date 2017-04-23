package com.service.chatservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

/**
 * Created by User on 20.04.2017.
 */
@RestController
@RequestMapping(value = "/v1")
public class ChatService {
    @RequestMapping(value= "/test", method = RequestMethod.GET)
    public @ResponseBody TestObject getString(){
        return new TestObject(Calendar.getInstance(), "Это ответ метода GET!");
    }
}
