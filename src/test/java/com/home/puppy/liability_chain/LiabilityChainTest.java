package com.home.puppy.liability_chain;

import org.junit.jupiter.api.Test;

/**
 * LiabilityChainTest
 *
 * @author hexiaogou
 * @desc liability chain test
 * @date 2023-03-27 22:14
 */
public class LiabilityChainTest {
    @Test
    public void liabilityChainPatternTest() {
        Handler handlerOne = new ConcreteHandlerOne();
        Handler handlerTwo = new ConcreteHandlerTwo();
        handlerOne.setSuccessor(handlerTwo);

        Request requestOne = new Request("RequestOne", RequestType.TYPE1);
        Request requestTwo = new Request("RequestOne", RequestType.TYPE2);

        handlerOne.handleRequest(requestOne);
        handlerOne.handleRequest(requestTwo);
    }
}
