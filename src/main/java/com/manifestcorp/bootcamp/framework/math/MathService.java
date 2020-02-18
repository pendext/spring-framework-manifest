package com.manifestcorp.bootcamp.framework.math;

public class MathService {

    private final Adder adder;
    private final Subtractor subtractor;

    public MathService() {
        this.adder = new Adder();
        this.subtractor = new Subtractor();
    }

    public int add(int a, int b) {
        return adder.add(a, b);
    }

    public int subtract(int a, int b) {
        return subtractor.subtract(a, b);
    }

}
