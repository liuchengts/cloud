package com.bass.demo.server.event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/****
 * kafka消息接收处理
 */
@Component
public class ListenerProcess {
    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        System.out.println("消息为：" + content);
    }
}
