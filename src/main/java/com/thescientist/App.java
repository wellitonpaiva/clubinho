package com.thescientist;

import com.spotify.apollo.Environment;
import com.spotify.apollo.httpservice.HttpService;
import com.spotify.apollo.httpservice.LoadingException;
import com.spotify.apollo.route.Route;

public final class App {

    public static void main(String[] args) throws LoadingException {
        HttpService.boot(App::init, "clubinho", args);
    }

    static void init(Environment environment) {
        environment.routingEngine()
                .registerAutoRoute(Route.sync("GET", "/", rc -> "hello world"));
    }
}