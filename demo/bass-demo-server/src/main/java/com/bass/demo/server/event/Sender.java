//package com.bass.demo.server.event;
//
//import com.bass.demo.server.event.kafka.Message;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.UUID;
//
///**
// * Created by apple on 2017/8/22.
// * 消息发送
// */
//@Component
//public class Sender {
//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    public void sendMessage() {
//        Message m = new Message();
//        m.setId(System.currentTimeMillis());
//        m.setMsg(UUID.randomUUID().toString());
//        m.setSendTime(new Date());
//        try {
//            kafkaTemplate.send("test1", objectMapper.writeValueAsString(m));
//        }catch (JsonProcessingException e){
//            e.printStackTrace();
//        }
//    }
//}
