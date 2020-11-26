package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:09
 */
public abstract class AbstractMessage {
    MessageSendImplementor messageSendImplementor;

    public AbstractMessage(MessageSendImplementor messageSendImplementor) {
        this.messageSendImplementor = messageSendImplementor;
    }

    public MessageSendImplementor getMessageSendImplementor() {
        return messageSendImplementor;
    }

    public abstract void sendMessage(String message);
}
