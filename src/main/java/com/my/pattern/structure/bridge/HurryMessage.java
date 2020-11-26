package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:19
 */
public class HurryMessage extends AbstractMessage{
    public HurryMessage(MessageSendImplementor messageSendImplementor) {
        super(messageSendImplementor);
    }

    public void hury(){
        System.out.println("已经通知XXX快速处理加急消息");
    }

    @Override
    public void sendMessage(String message) {
        message = "加急消息:" + message;
        super.messageSendImplementor.sendMessage(message);
        hury();
    }
}
