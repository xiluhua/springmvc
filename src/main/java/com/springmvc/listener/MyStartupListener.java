package com.springmvc.listener;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyStartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 容器启动完成后需要执行的逻辑
        System.out.println("Spring容器启动完成，可以进行相关的初始化工作。");

        // 检查是不是根容器（应用上下文）发出的启动完成事件
        if (event.getApplicationContext().getParent() == null) {
            // 只在根容器启动完成后执行一次
            System.out.println("------> Root application context started.");
            String url = "http://localhost:7008";
            System.out.println();
            System.out.println("vue23: "+url+"/request/person/getPersonName");
            System.out.println("vue23: "+url+"/students");
            System.out.println("vue23: "+url+"/cars");
            System.out.println();
        }
    }
}