package cn.jiangsq.spring.websocket.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author：少
 * @date: 2019/12/7 16:14
 * 配置STOMP
 */
@Configuration
@EnableWebSocketMessageBroker //启用WebSocket消息处理，由消息代理支持。
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        //返回给客户端前缀
        registry.enableSimpleBroker("/topic");
        //接收消息前缀
        registry.setApplicationDestinationPrefixes("/app");

    }
}
