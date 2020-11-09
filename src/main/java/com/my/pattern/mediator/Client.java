package com.my.pattern.mediator;

/**
 * @author lee
 * @version 1.0
 * @date 2020/11/9 15:46
 */
public class Client {
    public static void main(String[] args) {
        YuelaoMediator yuelaoMediator = new YuelaoMediator();
        Woman xiaohua = new Woman("小花", 2, yuelaoMediator);
        Man xiaoming = new Man("小明", 1, yuelaoMediator);
        Man xiaozhang = new Man("小张", 2, yuelaoMediator);

        xiaozhang.findCompanion(xiaoming);
        xiaoming.findCompanion(xiaohua);
        xiaozhang.findCompanion(xiaohua);
    }
}
