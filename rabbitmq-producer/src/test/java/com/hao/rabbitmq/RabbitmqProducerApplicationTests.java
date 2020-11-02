package com.hao.rabbitmq;

import com.hao.rabbitmq.component.RabbitSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitmqProducerApplicationTests {

    @Autowired
    private RabbitSender rabbitSender;

    @Test
    public void contextLoads() throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("attr1", "12345");
        properties.put("attr2", "abcde");
        rabbitSender.send("hello rabbitmq!", properties);
        Thread.sleep(10000);
    }

}
