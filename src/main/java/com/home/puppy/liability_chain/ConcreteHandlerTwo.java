package com.home.puppy.liability_chain;

/**
 * ConcreteHandlerTwo
 *
 * @author hexiaogou
 * @desc concrete handler two
 * @date 2023-03-27 22:13
 */
public class ConcreteHandlerTwo extends Handler {
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handled by ConcreteHandlerTwo");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
