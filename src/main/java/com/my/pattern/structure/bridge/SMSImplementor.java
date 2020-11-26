package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:18
 */
public class SMSImplementor implements MessageSendImplementor{
    @Override
    public void sendMessage(String message) {
        System.out.println("使用SMS发送消息:" + message);
    }
}
