package com.graphqlspringboot.example.resolves;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqlspringboot.example.model.Hello;
import com.graphqlspringboot.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    HelloService service;

    public Hello add(String message) {
        return service.add(message);
    }
}
