package com.home.puppy.proxy;

import org.junit.jupiter.api.Test;

/**
 * ProxyTest
 *
 * @author hexiaogou
 * @desc proxy test
 * @date 2023-03-27 22:01
 */
public class ProxyTest {
    @Test
    public void proxyPatternTest() {
        Subject subject = new Proxy();
        subject.request();;
    }
}
