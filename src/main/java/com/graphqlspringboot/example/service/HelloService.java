package com.graphqlspringboot.example.service;

import org.springframework.stereotype.Service;
import com.graphqlspringboot.example.model.Hello;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    private List<Hello> list = new ArrayList();


    public List<Hello> getAll() {
        return list;
    }

    public Hello add(String message) {

        Hello hello = new Hello();
        hello.setMessage(message);

        list.add(hello);

        return hello;
    }
}
