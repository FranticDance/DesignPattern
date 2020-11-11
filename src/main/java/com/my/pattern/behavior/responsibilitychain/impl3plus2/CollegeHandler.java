package com.my.pattern.behavior.responsibilitychain.impl3plus2;

/**
 * @author lee
 * 学院处理器
 */
public class CollegeHandler implements Handler {

    @Override
    public String handle(PurchaseRequest purchaseRequest, HandlerChain handlerChain) {
        System.out.println("院主任CollegeHandler开始处理");
        if(purchaseRequest.getPrice() <= 5000 && purchaseRequest.getPrice() > 1000){
            //TODO 真正的业务逻辑
            System.out.println("院主任CollegeHandler will deal it");
            //将请求交给下一位处理器处理，这样的效果就是，整个链条，不管链条上的handler能不能处理，整个链条都会遍历一遍
            //如果说，需要达到，当某一个handler能够处理，就停止遍历，不再交由下游handler处理，就将isStopTraversal设置为true。
            handlerChain.process(purchaseRequest, true);
              return "CollegeHandler do...";
        }else {
            System.out.println("院主任不能处理，交给下一位");
            String process = handlerChain.process(purchaseRequest, true);
            //return "CollegeHandler cant do...";
            return process;
        }
        //将请求交给下一位处理器处理，这样的效果就是，整个链条，不管链条上的handler能不能处理，整个链条都会遍历一遍
        //如果说，需要达到，当某一个handler能够处理，就停止遍历，不再交由下游handler处理，就将这里移动到上面else分支中。
        //handlerChain.proccess(purchaseRequest);
    }
}
