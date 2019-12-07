package cn.jiangsq.spring.websocket.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author：少
 * @date: 2019/12/7 16:04
 * 接收消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Greeting {

    private String content;

}
