package com.home.puppy.liability_chain;

/**
 * Handler
 *
 * @author hexiaogou
 * @desc handler
 * @date 2023-03-27 22:09
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
