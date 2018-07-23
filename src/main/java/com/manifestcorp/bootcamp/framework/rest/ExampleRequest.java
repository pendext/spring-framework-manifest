package com.manifestcorp.bootcamp.framework.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleRequest {

    private String input;

    public ExampleRequest(@JsonProperty("input") String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
