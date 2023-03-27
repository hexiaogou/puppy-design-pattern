package com.home.puppy.adapter;

/**
 * Adapter
 *
 * @author hexiaogou
 * @desc adapter
 * @date 2023-03-27 17:37
 */
public class Adapter implements Target {
    private Adapted adapted;

    public Adapter(Adapted adapted) {
        this.adapted = adapted;
    }

    @Override
    public void request() {
        adapted.specificRequest();
    }
}
