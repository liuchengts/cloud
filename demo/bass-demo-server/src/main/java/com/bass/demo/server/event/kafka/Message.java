package com.bass.demo.server.event.kafka;

import lombok.Data;

import java.util.Date;

/**
 * Created by apple on 2017/8/22.
 * kafka的消息base
 */
@Data
public class Message {
    private Long id;
    private String msg;
    private Date sendTime;

}
