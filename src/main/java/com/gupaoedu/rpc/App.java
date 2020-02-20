package com.gupaoedu.rpc;

import com.gupaoedu.vip.IPaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient = context.getBean(RpcProxyClient.class);
        IPaymentService iPaymentService = rpcProxyClient.clientProxy(IPaymentService.class,
                "localhost", 8080);

        iPaymentService.doPay();
    }
}
