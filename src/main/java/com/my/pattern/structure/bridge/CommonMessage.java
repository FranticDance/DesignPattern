package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:19
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageSendImplementor messageSendImplementor) {
        super(messageSendImplementor);
    }

    @Override
    public void sendMessage(String message) {
        message = "普通消息:" + message;
        super.messageSendImplementor.sendMessage(message);
    }
}
