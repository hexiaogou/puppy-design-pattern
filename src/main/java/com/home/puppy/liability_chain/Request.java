package com.home.puppy.liability_chain;

/**
 * Request
 *
 * @author hexiaogou
 * @desc request
 * @date 2023-03-27 22:10
 */
public class Request {
    private String name;
    private RequestType type;

    public Request(String name, RequestType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public RequestType getType() {
        return type;
    }
}
