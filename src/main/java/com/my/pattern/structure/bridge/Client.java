package com.my.pattern.structure.bridge;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/26 16:34
 */
public class Client {
    public static void main(String[] args) {
        CommonMessage commonMessage = new CommonMessage(new SMSImplementor());
        commonMessage.sendMessage("茶水间有新零食哟");

        System.out.println("-------------------------------");
        HurryMessage hurryMessage = new HurryMessage(new EmailImplementor());
        hurryMessage.sendMessage("今天下班前请提交工作任务计划");

    }
}
