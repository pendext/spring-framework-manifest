package com.manifestcorp.bootcamp.framework.rest;


public class ExampleBody {

    public ExampleBody(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
