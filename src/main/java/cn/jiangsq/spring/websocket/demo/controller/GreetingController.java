package cn.jiangsq.spring.websocket.demo.controller;

import cn.jiangsq.spring.websocket.demo.model.Greeting;
import cn.jiangsq.spring.websocket.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：少
 * @date: 2019/12/7 16:06
 */
@RestController
public class GreetingController {



    /**
     * @MessageMapping 注解确保如果将消息发送到目标/ hello，则会调用greeting()方法。
     * @SendTo 广播给所有订阅者
     * @param message
     * @return
     * @throws InterruptedException
     */
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws InterruptedException {

        Thread.sleep(1000);
        return new Greeting("Hello " + message.getName() +"!");
    }

}
