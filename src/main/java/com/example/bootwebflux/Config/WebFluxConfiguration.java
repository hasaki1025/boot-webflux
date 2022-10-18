package com.example.bootwebflux.Config;

import com.example.bootwebflux.Handler.UserHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class WebFluxConfiguration {


    private static final RequestPredicate ACCEPT_JSON = accept(MediaType.APPLICATION_JSON);
    public RouterFunction<ServerResponse> monoRouterFuction(UserHandler userHandler)
    {
        return null;
    }
}
