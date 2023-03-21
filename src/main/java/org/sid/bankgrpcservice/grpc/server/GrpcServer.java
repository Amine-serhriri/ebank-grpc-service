package org.sid.bankgrpcservice.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.sid.bankgrpcservice.grpc.service.BankGrpcServiceImp;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(9999)
                .addService(new BankGrpcServiceImp())
                .build();
        server.start();
        server.awaitTermination();
    }
}
