package com.example.bootwebflux.Handler;

import com.example.bootwebflux.domain.User;
import com.example.bootwebflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

@Component
public class UserHandler {

    @Autowired
    UserService userService;

    public Mono<ServerResponse> getUser(ServerRequest request) {
        Optional<Object> id = request.attribute("id");
        Map<String, Object> attributes = request.attributes();
        Long uId = (Long) attributes.get("uId");
        return null;

    }

    public Mono<ServerResponse> getUserCustomers(ServerRequest request) {
        return null;
    }

    public Mono<ServerResponse> deleteUser(ServerRequest request) {
        return null;
    }

}
