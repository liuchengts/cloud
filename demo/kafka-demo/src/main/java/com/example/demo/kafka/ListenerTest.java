package com.example.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2017/8/22.
 * 消息接收
 */
@Component
public class ListenerTest {

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        System.out.println("消息为：" + content);
    }
}
