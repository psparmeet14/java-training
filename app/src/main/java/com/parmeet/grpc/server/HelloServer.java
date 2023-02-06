package com.parmeet.grpc.server;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        var server = ServerBuilder.forPort(8080).addService(new HelloServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
