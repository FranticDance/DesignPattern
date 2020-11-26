package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:18
 */
public class EmailImplementor implements MessageSendImplementor{
    @Override
    public void sendMessage(String message) {
        System.out.println("使用Email发送消息:" + message);
    }
}
