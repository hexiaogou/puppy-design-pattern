package com.home.puppy.liability_chain;

/**
 * ConcreteHandler1
 *
 * @author hexiaogou
 * @desc concrete handler one
 * @date 2023-03-27 22:11
 */
public class ConcreteHandlerOne extends Handler {
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handled by ConcreteHandlerOne");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
